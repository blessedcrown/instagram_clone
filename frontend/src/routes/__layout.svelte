<script>
	import '../app.css';
	import Header from '$lib/layout/Header.svelte';
	import HeaderStore from '../stores/HeaderStore';
	import Modal from 'svelte-simple-modal';
</script>

<Modal>
	<Header></Header>
	<main class="root">
		<slot />
	</main>
</Modal>

<style>
.root {
	padding-top: 60px;
	display: flex;
	justify-content: center;
}
</style>