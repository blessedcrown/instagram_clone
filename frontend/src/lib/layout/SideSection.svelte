<script>
import BigProfile from "../profile/BigProfile.svelte";
import Profile from "../profile/Profile.svelte";
let innerWidth;
$: totalMargin = (innerWidth + 331) / 2;
</script>

<svelte:window bind:innerWidth={innerWidth} />
<div class="side" style={"left: " + totalMargin + "px;"}>
  <div class="profile">
    <BigProfile />
  </div>
  <div class="recommendation">
    <div class="recommendation__top">
      <p class="recommendation__text">회원님을 위한 추천</p>
      <a class="recommendation__link" href="./">모두 보기</a>
    </div>
    <div class="recommendation__list">
      <Profile />
      <Profile />
      <Profile />
      <Profile />
      <Profile />
      <Profile />
    </div>
    
  </div>
  <div class="copyright">
    <p class="copyright__text">
      소개 | 도움말 | 홍보 센터 | API | 채용 정보 | 개인정보처리방침 | 약관 | 위치 | 인기 계정 | 해시태그 | 언어 
    </p>
    <p class="copyright__text--bold">© 2022 INSTAGRAM FROM META</p>
  </div>
</div>

<style>
.side {
  display: flex;
  flex-direction: column;
  max-width: 293px;
  position: fixed;
  margin-top: 32px;
  right: 0;
}
.profile {
  margin: 18px 0px 10px 0px;
}
.recommendation {
  margin-bottom: 12px;
}
.recommendation__top {
  display: flex;
  justify-content: space-between;
  margin-top: 12px;
}
.recommendation__text {
  color: var(--font-color-light);
  font-weight: 600;
  font-size: 14px;
}
.recommendation__link {
  text-decoration: none;
  color: var(--font-color);
  font-weight: 600;
  font-size: 12px;
}
.recommendation__list {
  padding: 8px 0px;
}
.copyright {
  padding-bottom: 38px;
}
.copyright__text {
  color: var(--copyright-color);
  font-size: 12px;
  line-height: 16px;
  margin-bottom: 12px;
}
.copyright__text--bold {
  color: var(--copyright-color);
  font-size: 12px;
  font-weight: 600;
}
</style>