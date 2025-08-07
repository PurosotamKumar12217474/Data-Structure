package Tries;
static boolean search(TrieNode root, String key)
{
    
    TrieNode currentNode = root;

    for (int i = 0; i < key.length(); i++) {
        int index = key.charAt(i) - 'a';

        if (currentNode.childNode[index] == null)
            return false;
        currentNode = currentNode.childNode[index];
    }

    return (currentNode.isEndOfWord);
}