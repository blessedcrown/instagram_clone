<script>
import Card from '$lib/card/Card.svelte';
</script>

<div class="main">
  <div class="content">
    <Card pad={false} stretch={true}>
      <div class="content__left">
        <div class="content__select">
          <p class="username">golden_in_wild</p>
        </div>
      </div>
      <div class="content__right"></div>
    </Card>
  </div>
</div>

<style>
.main {
  display: flex;
  justify-content: center;
  padding: 20px;
  width: 100%;
  height: calc(100vh - 60px);
}
.content {
  max-width: 935px;
  height: 100%;
  width: 100%;
  display: flex;
}
.content__left {
  width: 309px;
  height: 100%;
  border-right: 1px solid rgba(219,219,219,1);
  display: flex;
  flex-direction: column;
}
.content__select {
  width: 100%;
  height: 60px;
  display: flex;
  justify-content: center;
  align-items: center;
  border-bottom: 1px solid rgba(219,219,219,1);
}
.username {
  color: var(--font-color);
  font-weight: 600;
}
.content__right {

}
</style>