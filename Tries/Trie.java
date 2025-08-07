public class TrieNode {
    TrieNode[] childNode;
    int wordCount;

    public TrieNode() {
        this.childNode = new TrieNode[26];
        this.wordCount = 0;
    }
}
public class Trie {
    TrieNode root;
    public Trie() {
        this.root = new TrieNode();
    }
    public boolean deleteKey(String word) {
        TrieNode currentNode = root;
        TrieNode lastBranchNode = null;
        char lastBranchChar = 'a';
        for (char c : word.toCharArray()) {
            if (currentNode.childNode[c - 'a'] == null) {
                return false;
            } else {
                int count = 0;
                for (int i = 0; i < 26; i++) {
                    if (currentNode.childNode[i] != null)
                        count++;
                }
                if (count > 1) {
                    lastBranchNode = currentNode;
                    lastBranchChar = c;
                }
                currentNode = currentNode.childNode[c - 'a'];
            }
        }

        int count = 0;
        for (int i = 0; i < 26; i++) {
            if (currentNode.childNode[i] != null)
                count++;
        }
        if (count > 0) {
            currentNode.wordCount--;
            return true;
        }
        if (lastBranchNode != null) {
            lastBranchNode.childNode[lastBranchChar - 'a'] = null;
            return true;
        }
        else {
            root.childNode[word.charAt(0) - 'a'] = null;
            return true;
        }
    }
}