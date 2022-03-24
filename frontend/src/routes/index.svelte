<script>
import Post from "$lib/post/Post.svelte";
import SideSection from "../lib/layout/SideSection.svelte";
</script>

<svelte:head>
	<title>Home</title>
</svelte:head>

<div class="container">
	<section class="content">
		<Post></Post>
		<Post></Post>
		<Post></Post>
		<Post></Post>
	</section>
	<SideSection />
</div>

<style>
.content {
	display: flex;
	flex-direction: column;
	align-items: center;
	padding-top: 24px;
}
.container {
	max-width: 935px;
	width: 100%;
	display: flex;
	flex-flow: row nowrap;
	align-items: stretch;
	position: relative;
	margin: 0 auto;
}
</style>
