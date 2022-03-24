<script>

</script>

<div class="profile">
  <div>
    <img class="profile__image" src="images/dog3.jpg" alt="cat">
  </div>
  <div class="profile__name-container">
    <p class="profile__name">thegolden</p>
    <p class="profile__status">thegolden님이 팔로우합니다</p>
  </div>
  <div>
    <a href="./" class="profile__link">팔로우</a>
  </div>
</div>

<style>
.profile {
  display: flex;
  align-items: center;
  padding: 4px 0px;
}
.profile__image {
  width: 32px;
  height: 32px;
  border-radius: 32px;
  margin-right: 12px;
}
.profile__name-container {
  width: 100%;
}
.profile__name {
  color: var(--font-color);
  font-size: 14px;
  line-height: 16px;
}
.profile__status {
  color: var(--font-color-light);
  font-size: 14px;
  line-height: 16px;
}
.profile__link {
  white-space: nowrap;
  margin-left: 8px;
  color: var(--link-color);
  text-decoration: none;
  font-size: 14px;
}
</style>