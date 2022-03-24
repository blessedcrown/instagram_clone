<script>
// Track which stage the modal is in
let modalStatus = {
    'upload': true,
    'adjust': false,
    'filter': false,
    'post': false
}

// Adjust modal size when window resize
let windowWidth;
let windowHeight;

$: modalHeight = windowWidth > windowHeight * 1.168 ? windowHeight - 200 : (windowHeight - 200) - ((windowHeight * 1.168) - windowWidth);
$: modalWidth = modalHeight / 1.0625;

function uploadFile() {
    
}
</script>

<svelte:window bind:innerWidth={windowWidth} bind:innerHeight={windowHeight} />
<div class="modal" style='width: {modalWidth}px; height: {modalHeight}px' bind:clientHeight={modalHeight}>
    <div class="modal__top">
        <h4 class="modal__title">새 게시물 만들기</h4>
    </div>
    <div class="modal__content">
        <img src="svg/media.svg" class="modal__icon" alt="video and images icon"/>
        <h2 class="modal__text">사진과 동영상을 여기에 끌어다 놓으세요</h2>
        <input type="file" style="display: none;" />
        <button class="modal__button">컴퓨터에서 선택</button>
    </div>
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
.modal__content {
    width: 100%;
    height: 100%;
    display: flex;
    justify-content: center;
    align-items: center;
    flex-direction: column;
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
</style>