<script>
  export let margin = false;
  export let pad = true;
  export let stretch = false;
  // TODO: include/exclude padding option
</script>

<div class="card" class:pad={pad} class:margin={margin} class:stretch={stretch}>
  <slot />
</div>

<style>
.card {
  background: #ffffff;
  border: 1px solid rgba(219,219,219,1);
  border-radius: 4px;
}
/* Pad removed in card used in home page */
.pad {
  padding: 12px;
}
/* Margin added for card used in home page */
.margin {
  margin-bottom: 24px;
}
/* Stretch the card to fit parent (used in direct inbox page) */
.stretch {
  width: 100%;
}
</style>