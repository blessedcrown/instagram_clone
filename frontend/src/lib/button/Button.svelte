<button class="button">
  <slot />
</button>

<style>
.button {
  padding: 20px;
  background: var(--accent-one);
  border-radius: 5px;
  color: var(--font-color);
  font-size: var(--font-size);
}
.button:hover {
  opacity: 0.8;
}
</style>