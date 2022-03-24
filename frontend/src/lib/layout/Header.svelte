<script>
import { page } from '$app/stores';
import { getContext } from 'svelte';
import HeaderStore from '../../stores/HeaderStore.js';
import CreateModal from '$lib/modal/CreateModal.svelte';
import ModalCloseButton from '$lib/modal/ModalCloseButton.svelte';

// Open modal on header icon click
const { open } = getContext('simple-modal');
const showModal = () => open(CreateModal, {}, {
  closeButton: ModalCloseButton, 
  styleWindowWrap: {height: '100%', margin: '80px', display: 'flex', justifyContent: 'center', alignItems: 'center'},
  styleWindow: { width: 'auto', height: 'max-content' },
  styleContent: {width: '100%', padding: '0px', display: 'flex', alignItems: 'center'},
  styleBg: {background: 'rgb(0,0,0,0.85)'},
}, {
    onClose: () => {
        alert("closing!");
    }
});

// Change header icon 
let iconSelectedStatus = {
    "home": $page.url.pathname === "/" ? true : false,
    "inbox": $page.url.pathname === "/direct/inbox" ? true : false,
    "create": false,
    "explore": $page.url.pathname === "/explore" ? true : false,
    "notification": false,
    "user": false
}

$: iconClassStatus = {
    "home": iconSelectedStatus["home"] ? "fa-solid fa-house" : "fa-solid fa-house",
    "inbox": iconSelectedStatus["inbox"] ? "fa-solid" : "fa-regular",
    "create": iconSelectedStatus["create"] ? "fa-solid" : "fa-regular",
    "explore": iconSelectedStatus["explore"] ? "fa-solid" : "fa-regular",
    "notification": iconSelectedStatus["notification"] ? "fa-solid" : "fa-regular"
}

function updateLinkStatus(iconName) {
    Object.entries(iconSelectedStatus).forEach(([key]) => {
        iconSelectedStatus[key] = false;
    });
    iconSelectedStatus[iconName] = true;
    updateStore();
}

function updateStore() {
  HeaderStore.set({...iconSelectedStatus});
};

//on:click={() => updateLinkStatus("create")} 
</script>

<nav class="header">
  <div class="header__container">
    <div class="header__left">
      <a style="text-decoration: none;" href="/">
        <h1 class="header__logo">Instagram</h1>
      </a>
    </div>
    <div class="header__center">
      <div class="header__input">
        <input class="input__text" type="text" autocapitalize="none">
        <div class="input__container">
          <i class="fa-solid fa-magnifying-glass search-icon"></i>
          <span class="input__placeholder">검색</span>
        </div>
      </div>
    </div>
    <div class="header__right">
      <a href="/">
        <i on:click={() => updateLinkStatus("home")}
            class="{iconClassStatus['home']} icon"></i>
      </a>
      <a href="/direct/inbox">
        <i on:click={() => updateLinkStatus("inbox")}
            class="{iconClassStatus['inbox']} fa-paper-plane icon" />
      </a>
      <i  on:click={showModal}
        class="{iconClassStatus['create']} fa-regular fa-square-plus icon"></i>
      <a href="/explore">
        <i on:click={() => updateLinkStatus("explore")}
            class="{iconClassStatus['explore']} fa-compass icon"></i>
      </a>
      <i on:click={() => updateLinkStatus("notification")}
        class="{iconClassStatus['notification']} fa-regular fa-heart icon"></i>
      <i on:click={() => updateLinkStatus("user")}
        class="fa-regular fa-user icon"></i>
    </div>
  </div>
</nav>

<style>
.header {
  width: 100%;
  background-color: var(--header-color);
  border-bottom: 1px solid rgba(219,219,219,1);
  height: 60px;
  position: fixed;
  top: 0;
  display: flex;
  justify-content: center;
  z-index: 999;
}
.header__container {
  display: flex;
  justify-content: space-between;
  align-items: center;
  width: 100%;
  max-width: 935px;
  padding: 0px 20px;
}
.header__left {

}
.header__logo {
  margin: 0px;
}
.header__center {

}
.header__input {
  display: flex;
  align-items: center;
  position: relative;
}
.input__text {
  border: 0px;
  border-radius: 8px;
  background-color: #efefef;
  padding: 3px 16px;
  font-size: 16px;
  font-family: var(--font-family);
  width: 100%;
  height: 36px;
}
.input__container {
  position: absolute;
  padding: 0px 16px;
  display: flex;
  align-items: center;
}
.input__placeholder {
  color: var(--font-color-light);
}
.search-icon {
  font-size: 16px;
  margin-right: 12px;
  color: var(--font-color-light);
}
.header__right {

}
.icon {
  font-size: 24px;
  margin-left: 22px;
}
.icon:hover {
  cursor: pointer;
}
.icon:active {
  color: var(--font-color-light);
}
</style>