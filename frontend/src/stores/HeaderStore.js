import { writable } from 'svelte/store';

const HeaderStore = writable(
    {
        "home": false,
        "inbox": false,
        "create": false,
        "explore": false,
        "notification": false,
        "user": false
    }
);

export default HeaderStore;