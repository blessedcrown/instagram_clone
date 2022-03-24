<script>
	// This property is used by Modal.svelte to pass down the close function
  export let onClose;
</script>

<style>
	button {
		position: fixed;
		top: 0;
		right: 0;
	}
    .close-icon {
        font-size: 32px;
        margin: 8px;
        padding: 8px;
        color: white;
    }
</style>

<button on:click={onClose}>
    <i class="fa-solid fa-xmark close-icon"></i>
</button>