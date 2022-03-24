<script>

</script>

<div class="main">
  <div class="content">
    <div class="row--alt">
      <img class="image image-1" src="images/dog.jpg" alt="dog">
      <img class="image image-2" src="images/dog2.jpg" alt="dog">
      <img class="image image-3" src="images/dog3.jpg" alt="dog">
    </div>
    <div class="row">
      <img class="image image-1" src="images/dog.jpg" alt="dog">
      <img class="image image-2" src="images/dog2.jpg" alt="dog">
      <img class="image image-3" src="images/dog3.jpg" alt="dog">
    </div>
  </div>
</div>

<style>
.main {
  display: flex;
  justify-content: center;
}
.content {
  max-width: 935px;
  padding: 40px 20px;
  display: grid;
  grid-gap: 28px;
}
.row {
  display: grid;
  grid-template-columns: repeat(3, 1fr);
  grid-gap: 28px;
  grid-template-areas:
  "image1 image2 image3";
}
.row--alt {
  display: grid;
  grid-template-columns: repeat(3, 1fr);
  grid-template-rows: repeat(2, 1fr);
  grid-gap: 28px;
  grid-template-areas:
  "image1 image3 image3"
  "image2 image3 image3";
}
.image {
  width: 100%;
  height: 100%;
}
.image-1 {
  grid-area: image1;
}
.image-2 {
  grid-area: image2;
}
.image-3 {
  grid-area: image3;
}
</style>