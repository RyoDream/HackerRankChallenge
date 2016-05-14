package DataStructures.Trees;

/**
 * Tree: Huffman Decoding
 *
 * Huffman coding assigns variable length codewords to fixed length input characters based on their frequencies.
 * More frequent characters are assigned shorter codewords and less frequent characters are assigned longer codewords.
 * A Huffman tree is made for the input string and characters are decoded based on their position in the tree.
 * We add a '0' to the codeword when we move left in the binary tree and a '1' when we move right in the binary tree.
 * We assign codes to the leaf nodes which represent the input characters.
 *
 * For example :
 *         {ϕ,5}
 *      0 /     \ 1
 *     {ϕ,2}   {A,3}
 *    0/   \1
 * {B,1}  {C,1}
 *
 * Input characters are only present on the leaves.
 * Internal nodes have a character value of ϕ. Codewords:
 *
 * A - 1
 * B - 00
 * C - 01
 *
 * No codeword appears as a prefix of any other codeword. Huffman encoding is a prefix free encoding technique.
 *
 * Encoded String "1001011" represents the string "ABACA"
 * You have to decode an encoded string using the Huffman tree.
 *
 * You are given pointer to the root of the Huffman tree and a binary coded string. You need to print the actual string.
 *
 * Input Format
 * You are given a function,
 * void decode_huff(node * root, string s)
 * {
 *
 * }
 *
 * The structure for node is defined as :
 * struct node
 * {
 *  int freq;
 *  char data;
 *  node * left;
 *  node * right;
 * }node;
 *
 * Note:
 * Internal nodes have data='\0'(ϕ )
 *
 * Output Format
 * Output the decoded string on a single line.
 *
 * Sample Input
 *         {ϕ,5}
 *      0 /     \ 1
 *     {ϕ,2}   {A,3}
 *    0/   \1
 * {B,1}  {C,1}
 *
 * S="1001011"
 * Sample Output
 * ABACA
 */

public class HuffmanDecoding {
    class Node {
        public int frequency;
        public char data;
        public Node left, right;

        public Node(int frequency, char data, Node left, Node right) {
            this.frequency = frequency;
            this.data = data;
            this.left = left;
            this.right = right;
        }
    }

    void decode (String S, Node root) {
        if(root == null)
            return;

        String res = "";
        int i = 0;

        while( i < S.length()) {
            Node node = root;
            while(node.data == '\0') {
                if (S.charAt(i) == '0')
                    node = node.left;
                else
                    node = node.right;
                i++;
            }
            res += node.data;
        }

        System.out.println(res);
    }

    void test() {

        Node node4 = new Node(1,'B',null,null);
        Node node5 = new Node(1,'C',null,null);
        Node node2 = new Node(2,'\0',node4, node5);
        Node node3 = new Node(3,'A',null, null);
        Node node1 = new Node(5,'\0',node2, node3);

        decode("1001011", node1);
    }

    public static void main(String[] args) {
        new HuffmanDecoding().test();
    }
}
