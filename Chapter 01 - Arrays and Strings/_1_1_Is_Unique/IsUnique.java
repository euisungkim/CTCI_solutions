public class IsUnique {
  // Implement an algorithm to determine if a string has all unique characters.
  // What if you cannot use additional data structures?
  private static final EXTENDED_ASCII_CHARS = 256;
  public boolean isUniqueArray(String s) {
    if ( s.length() > EXTENDED_ASCII_CHARS ) return true;
    boolean[] ch = new boolean[EXTENDED_ASCII_CHARS];
    for ( int i = 0; i < s.length(); i++ ) {
      int val = str.charAt(i);
      if (ch[val]) {
        return false;
      }
      ch[val] = true;
    }

    // O(n) runtime
    // O(1) space
  }

  // HashSet Version
  public boolean isUniqueHashSet(String s) {
    if ( s.length() > EXTENDED_ASCII_CHARS ) return true;
    HashSet<Character> set = new HashSet<>(EXTENDED_ASCII_CHARS);
    for ( char c : s.toCharArray() ) {
      if ( set.contains(c) ) return false;
      set.add(c);
    }

    return true;
    // O(n) runtime
    // O(1) space
  }
}