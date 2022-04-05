<script>
import Profile from '$lib/profile/Profile.svelte';

// Adjust modal size when window resize
let windowWidth;
let windowHeight;

$: modalHeight = windowWidth > windowHeight * 1.168 ? windowHeight - 200 : (windowHeight - 200) - ((windowHeight * 1.168) - windowWidth);
$: modalWidth = modalHeight / 1.0625;

// Enum for modal status
const Status = Object.freeze({
    UPLOAD: 'upload',
    ADJUST: 'adjust',
    FILTER: 'filter',
    POST: 'post'
});

let avatar;
let fileinput;
let modalStatus = {
    'upload': true,
    'adjust': false,
    'filter': false,
    'post': false
}

function onFileSelected(e) {
    let image = e.target.files[0];
    let reader = new FileReader();
    reader.readAsDataURL(image);
    reader.onload = e => {
        avatar = e.target.result;

        setModalStatus(Status.ADJUST);
    };
}

function setModalStatus(status) {
    Object.entries(modalStatus).forEach(([key, value]) => {
        modalStatus[key] = false;
    })
    modalStatus[status] = true;
}
</script>

<svelte:window bind:innerWidth={windowWidth} bind:innerHeight={windowHeight} />
<div class="modal" style='width: {modalWidth}px; height: {modalHeight}px' bind:clientHeight={modalHeight}>
    {#if modalStatus.upload }
    <div class="modal__top">
        <h4 class="modal__title">새 게시물 만들기</h4>
    </div>

    <div class="modal__content--alt">
        <img src="svg/media.svg" class="modal__icon" alt="video and images icon"/>
        <h2 class="modal__text">사진과 동영상을 여기에 끌어다 놓으세요</h2>

        <label for="upload-media" class="modal__button">컴퓨터에서 선택</label>
        <input type="file" style="display: none;" name="media" id="upload-media" 
            accept="image/jpeg, image/png, image/heic, image/heif, video/mp4, video/quicktime" 
            on:change={(e)=>onFileSelected(e)}
            bind:this={fileinput}/>
    </div>
    {:else if modalStatus.adjust }
    <div class="modal__top--alt">
        <i class="fas fa-arrow-left modal__arrow"></i>
        <h4 class="modal__title">자르기</h4>
        <p class="modal__next-text" on:click={() => setModalStatus(Status.FILTER)}>다음</p>
    </div>

    <div class="modal__content">
        <img class="modal__avatar" src="{avatar}" alt="uploading file" />
    </div>
    {:else if modalStatus.filter}
    <div class="modal__top--alt">
        <i class="fas fa-arrow-left modal__arrow"></i>
        <h4 class="modal__title">편집</h4>
        <p class="modal__next-text" on:click={() => setModalStatus(Status.POST)}>다음</p>
    </div>

    <div class="modal__content">
        <img class="modal__avatar" src="{avatar}" alt="uploading file" />
        <div class="modal__side">
            <div class="filter__top">
                <div class="filter__menu">필터</div>
                <div class="filter__menu">조정</div>
            </div>
            <div class="filter__list">
                <div class="filter__image">
                    <img alt="filter effect"/>
                    <p class="filter__text">원본</p>
                </div>
                <div class="filter__image">
                    <img alt="filter effect"/>
                    <p class="filter__text">Clarendon</p>
                </div>
                <div class="filter__image">
                    <img alt="filter effect"/>
                    <p class="filter__text">Gingham</p>
                </div>
                <div class="filter__image">
                    <img alt="filter effect"/>
                    <p class="filter__text">Moon</p>
                </div>
                <div class="filter__image">
                    <img alt="filter effect"/>
                    <p class="filter__text">Lark</p>
                </div>
                <div class="filter__image">
                    <img alt="filter effect"/>
                    <p class="filter__text">Reyes</p>
                </div>
                <div class="filter__image">
                    <img alt="filter effect"/>
                    <p class="filter__text">Juno</p>
                </div>
                <div class="filter__image">
                    <img alt="filter effect"/>
                    <p class="filter__text">Slumber</p>
                </div>
                <div class="filter__image">
                    <img alt="filter effect"/>
                    <p class="filter__text">Crema</p>
                </div>
                <div class="filter__image">
                    <img alt="filter effect"/>
                    <p class="filter__text">Ludwig</p>
                </div>
                <div class="filter__image">
                    <img alt="filter effect"/>
                    <p class="filter__text">Aden</p>
                </div>
                <div class="filter__image">
                    <img alt="filter effect"/>
                    <p class="filter__text">Perpetua</p>
                </div>
            </div>
        </div>
    </div>
    {:else if modalStatus.post}
    <div class="modal__top--alt">
        <i class="fas fa-arrow-left modal__arrow"></i>
        <h4 class="modal__title">새 게시물 만들기</h4>
        <p class="modal__next-text">공유하기</p>
    </div>

    <div class="modal__content">
        <img class="modal__avatar" src="{avatar}" alt="uploading file" />
        <div class="modal__side">
            <Profile description={false} name={"Zerro"}></Profile>
            <div class="">

            </div>
        </div>
    </div>
    {/if}
</div>

<style>
.modal {
    margin: 0px;
    height: 100%;
    display: flex;
    flex-direction: column;
}
.modal__top {
    width: 100%;
    height: 42px;
    border-bottom: 1px solid rgba(219,219,219,1);
    display: flex;
    justify-content: center;
    align-items: center;
}
.modal__top--alt {
    width: 100%;
    height: 42px;
    border-bottom: 1px solid rgba(219,219,219,1);
    display: flex;
    justify-content: space-between;
    align-items: center;
    padding: 0px 10px;
}
.modal__avatar {
    width: 100%;
    height: 100%;
    border-radius: 0px 0px 0.5rem 0.5rem;
}
.modal__arrow {
    padding: 8px;
    font-size: 24px;
}
.modal__next-text {
    margin: 16px;
    color: var(--link-color);
    font-weight: 600;
    font-size: 14px;
}
.modal__next-text:hover {
    cursor: pointer;
}
.modal__content {
    width: 100%;
    height: 100%;
    display: flex;
    justify-content: center;
    align-items: center;
}
.modal__content--alt {
    width: 100%;
    height: 100%;
    display: flex;
    justify-content: center;
    align-items: center;
    flex-direction: column;
}
.modal__side {
    width: 340px;
}
.filter__top {
    display: flex;
}
.filter__menu {
    width: 100%;
    height: 50px;
    border-bottom: 1px solid rgb(38,38,38);
    display: flex;
    justify-content: center;
    align-items: center;
    font-size: 16px;
}
.filter__list {
    display: grid;
    grid-template-columns: 1fr 1fr 1fr;
}
.filter__image {
    width: 88px;
    height: 88px;
}
.filter__text {
    color: rgba(0,149,246,1);
    font-size: 12px;
    line-height: 16px;
}
.modal__title {
    font-size: 16px;
    font-weight: 600;
    margin: 0px;
}
.modal__icon {
    width: 100px;
    height: 100px;
    margin-bottom: 20px;
}
.modal__text {
    font-family: -apple-system,BlinkMacSystemFont,"Segoe UI",Roboto,Helvetica,Arial,sans-serif;
    font-size: 22px;
    font-weight: 300;
    margin: 0px;
}
.modal__button {
    background-color: rgba(0,149,246,1);
    border: 1px solid transparent;
    border-radius: 4px;
    font-size: 14px;
    font-weight: 600;
    padding: 5px 9px;
    text-align: center;
    color: white;
    margin-top: 20px;
}
.modal__button:hover {
    cursor: pointer;
}
</style>