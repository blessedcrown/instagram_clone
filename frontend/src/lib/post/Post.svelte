<script>
	import Card from '$lib/card/Card.svelte';
</script>

<div class="post">
  <Card pad={false} margin={true} stretch={true}>
    <header class="post__header">
      <a href="./">
        <img class="post__userimage" src="images/cat2.jpg" alt="profile" />
      </a>
      <div class="post__title-container">
        <p class="post__username">Cat Lovers</p>
      </div>
    </header>
    <img class="post__img" src="images/cat.jpg" alt="" />
    <div class="post__footer">
      <section class="footer__top">
        <div>
          <i class="fa-regular fa-heart post__icon" />
          <i class="fa-regular fa-comment post__icon" />
          <i class="fa-regular fa-paper-plane post__icon" />
        </div>
        <i class="fa-regular fa-bookmark post__icon--last"></i>
      </section>
      <section class="footer__middle">
        <p class="text--bold">좋아요 23개</p>
      </section>
      <section class="footer__bottom">
        <p><a href="./" class="post__link">Cat Lovers</a> Cutest cat ever</p>
      </section>
      <section class="footer__date">
        <p class="date__text">5일전</p>
      </section>
    </div>
    <div class="post__comment">
      <div class="comment__icon-container">
        <i class="fa-regular fa-face-smile comment__icon"></i>
      </div>
      <textarea class="comment__textarea" placeholder="댓글 달기..."/>
    </div>
  </Card>
</div>


<style>
.post {
    width: 614px;
}
.post__header {
    width: 100%;
    padding: 14px 4px 14px 16px;
    display: flex;
    align-items: center;
}
.post__userimage {
    width: 32px;
    height: 32px;
    border-radius: 32px;
}
.post__title-container {
    margin-left: 12px;
}
.post__username {
    font-size: 14px;
    font-weight: 600;
    color: var(--font-color);
}
.post__icon {
    font-size: 24px;
    margin: 8px 16px 8px 0px;
}
.post__icon:hover {
    color: #888888;
    cursor: pointer;
}
.post__icon--last {
    font-size: 24px;
    margin: 8px 0px 8px 0px;
}
.post__icon--last:hover {
    color: #888888;
    cursor: pointer;
}
.post__img {
    width: 100%;
}
.post__footer {
    padding: 0px 16px;
}
.footer__top {
    display: flex;
    justify-content: space-between;
    padding: 6px 0px 8px 0px;
}
.footer__middle {
    margin-bottom: 8px;
}
.footer__date {
    margin-bottom: 16px;
}
.date__text {
    color: var(--font-color-light);
    font-size: 10px;
}
.post__link {
    color: var(--font-color);
    font-weight: 600;
    text-decoration: none;
}
.post__link:hover {
    text-decoration: underline;
}
.post__comment {
    display: flex;
    align-items: center;
    width: 100%;
    border-top: 1px solid #efefef;
    padding: 6px 16px;
}
.comment__icon-container {
    padding: 8px 16px 8px 0px;
}
.comment__icon {
    font-size: 24px;
}
.comment__icon:hover {
    color: #888888;
    cursor: pointer;
}
.comment__textarea {
    resize: none;
    width: 100%;
    height: 18px;
    border: 0px;
    font-size: 14px;
    font-family: var(--font-family);
}
.comment__textarea:focus {
    outline: none;
}
.text--bold {
    font-weight: 600;
}
</style>
