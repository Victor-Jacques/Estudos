class TrieNode:
    def __init__(self):
        self.children = {}
        self.is_word_end = False

class Trie:
    def __init__(self):
        self.root = TrieNode()

    def insert(self, word):
        node = self.root
        for char in word:
            if char not in node.children:
                node.children[char] = TrieNode()
            node = node.children[char]
            if node.is_word_end:
                return False
        node.is_word_end = True
        return True

while True:
    n = int(input())
    if n == 0:
        break
    
    trie = Trie()
    prefixes = {}
    is_good = True
    for i in range(n):
        word = input().strip()
        if not is_good:
            continue
        
        node = trie.root
        has_prefix = False
        for j in range(len(word)):
            char = word[j]
            if char in node.children:
                node = node.children[char]
                if node.is_word_end or j == len(word) - 1 and node.children:
                    is_good = False
                    break
            else:
                node.children[char] = TrieNode()
                node = node.children[char]
            
            if word[:j+1] in prefixes:
                is_good = False
                break
        if not is_good:
            continue
        
        if trie.insert(word):
            for j in range(len(word)):
                prefixes[word[:j+1]] = node.children
        else:
            is_good = False
            continue
    
    if is_good:
        print("Conjunto Bom")
    else:
        print("Conjunto Ruim")


