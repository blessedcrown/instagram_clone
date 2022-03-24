<script>

</script>

<div class="big-profile">
  <img class="big-profile__image" src="images/dog2.jpg">
  <div class="big-profile__name-container">
    <p class="big-profile__name">golden_in_wild</p>
    <p class="big-profile__subname">Golden in wild</p>
  </div>
  <div>
    <a href="./" class="big-profile__link">전환</a>
  </div>
</div>

<style>
.big-profile {
  display: flex;
  align-items: center;
  justify-content: space-between;
}
.big-profile__image {
  width: 56px;
  height: 56px;
  border-radius: 56px;
  margin-right: 12px;
}
.big-profile__name-container {
  margin-left: 4px;
  width: 100%;
}
.big-profile__name {
  color: var(--font-color);
  font-weight: 600;
  font-size: 14px;
}
.big-profile__subname {
  color: var(--font-color-light);
  font-size: 14px;
}
.big-profile__link {
  color: var(--link-color);
  text-decoration: none;
  font-size: 12px;
  width: 100%;
  white-space: nowrap;
}
</style>