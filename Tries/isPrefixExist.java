package Tries;

public boolean isPrefixExist(TrieNode root, String key) {
    TrieNode currentNode = root;
    for (char c : key.toCharArray()) {
        if (currentNode.childNode[c - 'a'] == null) {
            return false;
        }
        currentNode = currentNode.childNode[c - 'a'];
    }
    return true;
}
