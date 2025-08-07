package Tries;

void insert(TrieNode root, String key)
{
    TrieNode currentNode = root;

    for (int i = 0; i < key.length(); i++) {
        int index = key.charAt(i) - 'a';

        if (currentNode.childNode[index] == null) {

            currentNode.childNode[index] = new TrieNode();
        }

        currentNode = currentNode.childNode[index];
    }

    currentNode.wordCount++;
}