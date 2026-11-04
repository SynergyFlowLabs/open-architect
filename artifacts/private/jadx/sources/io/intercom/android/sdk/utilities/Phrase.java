package io.intercom.android.sdk.utilities;

import android.app.Fragment;
import android.content.Context;
import android.content.res.Resources;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.f1;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes13.dex */
public final class Phrase {
    private static final int EOF = 0;
    private char curChar;
    private int curCharIndex;
    private CharSequence formatted;
    private Token head;
    private final Set<String> keys = new HashSet();
    private final Map<String, CharSequence> keysToValues = new HashMap();
    private final CharSequence pattern;

    private static class KeyToken extends Token {
        private final String key;
        private CharSequence value;

        KeyToken(Token token, String str) {
            super(token);
            this.key = str;
        }

        @Override // io.intercom.android.sdk.utilities.Phrase.Token
        void expand(SpannableStringBuilder spannableStringBuilder, Map<String, CharSequence> map) {
            this.value = map.get(this.key);
            int formattedStart = getFormattedStart();
            spannableStringBuilder.replace(formattedStart, this.key.length() + formattedStart + 2, this.value);
        }

        @Override // io.intercom.android.sdk.utilities.Phrase.Token
        int getFormattedLength() {
            return this.value.length();
        }
    }

    private static class LeftCurlyBracketToken extends Token {
        LeftCurlyBracketToken(Token token) {
            super(token);
        }

        @Override // io.intercom.android.sdk.utilities.Phrase.Token
        void expand(SpannableStringBuilder spannableStringBuilder, Map<String, CharSequence> map) {
            int formattedStart = getFormattedStart();
            spannableStringBuilder.replace(formattedStart, formattedStart + 2, "{");
        }

        @Override // io.intercom.android.sdk.utilities.Phrase.Token
        int getFormattedLength() {
            return 1;
        }
    }

    private static class TextToken extends Token {
        private final int textLength;

        TextToken(Token token, int i10) {
            super(token);
            this.textLength = i10;
        }

        @Override // io.intercom.android.sdk.utilities.Phrase.Token
        void expand(SpannableStringBuilder spannableStringBuilder, Map<String, CharSequence> map) {
        }

        @Override // io.intercom.android.sdk.utilities.Phrase.Token
        int getFormattedLength() {
            return this.textLength;
        }
    }

    private static abstract class Token {
        Token next;
        private final Token prev;

        protected Token(Token token) {
            this.prev = token;
            if (token != null) {
                token.next = this;
            }
        }

        abstract void expand(SpannableStringBuilder spannableStringBuilder, Map<String, CharSequence> map);

        abstract int getFormattedLength();

        final int getFormattedStart() {
            Token token = this.prev;
            if (token == null) {
                return 0;
            }
            return token.getFormattedStart() + this.prev.getFormattedLength();
        }
    }

    private Phrase(CharSequence charSequence) {
        this.curChar = charSequence.length() > 0 ? charSequence.charAt(0) : (char) 0;
        this.pattern = charSequence;
        Token token = null;
        while (true) {
            token = token(token);
            if (token == null) {
                return;
            }
            if (this.head == null) {
                this.head = token;
            }
        }
    }

    private void consume() {
        int i10 = this.curCharIndex + 1;
        this.curCharIndex = i10;
        this.curChar = i10 == this.pattern.length() ? (char) 0 : this.pattern.charAt(this.curCharIndex);
    }

    public static Phrase from(Fragment fragment, @f1 int i10) {
        return from(fragment.getResources(), i10);
    }

    private KeyToken key(Token token) {
        char c10;
        StringBuilder sb2 = new StringBuilder();
        consume();
        while (true) {
            c10 = this.curChar;
            if ((c10 < 'a' || c10 > 'z') && ((c10 < 'A' || c10 > 'Z') && c10 != '_' && (c10 < '0' || c10 > '9'))) {
                break;
            }
            sb2.append(c10);
            consume();
        }
        if (c10 != '}') {
            throw new IllegalArgumentException("Missing closing brace: } in '" + ((Object) this.pattern) + "'");
        }
        consume();
        if (sb2.length() != 0) {
            String string = sb2.toString();
            this.keys.add(string);
            return new KeyToken(token, string);
        }
        throw new IllegalArgumentException("Empty key: {} in '" + ((Object) this.pattern) + "'");
    }

    private LeftCurlyBracketToken leftCurlyBracket(Token token) {
        consume();
        consume();
        return new LeftCurlyBracketToken(token);
    }

    private char lookahead() {
        if (this.curCharIndex < this.pattern.length() - 1) {
            return this.pattern.charAt(this.curCharIndex + 1);
        }
        return (char) 0;
    }

    private TextToken text(Token token) {
        int i10 = this.curCharIndex;
        while (true) {
            char c10 = this.curChar;
            if (c10 == '{' || c10 == 0) {
                break;
            }
            consume();
        }
        return new TextToken(token, this.curCharIndex - i10);
    }

    private Token token(Token token) {
        char c10 = this.curChar;
        if (c10 == 0) {
            return null;
        }
        if (c10 != '{') {
            return text(token);
        }
        char cLookahead = lookahead();
        if (cLookahead == '{') {
            return leftCurlyBracket(token);
        }
        if (cLookahead >= 'a' && cLookahead <= 'z') {
            return key(token);
        }
        throw new IllegalArgumentException("Unexpected character '" + cLookahead + "'; expected key in '" + ((Object) this.pattern) + "'");
    }

    public CharSequence format() {
        if (this.formatted == null) {
            if (!this.keysToValues.keySet().containsAll(this.keys)) {
                HashSet hashSet = new HashSet(this.keys);
                hashSet.removeAll(this.keysToValues.keySet());
                throw new IllegalArgumentException("Missing keys: " + hashSet + " in '" + ((Object) this.pattern) + "'");
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.pattern);
            for (Token token = this.head; token != null; token = token.next) {
                token.expand(spannableStringBuilder, this.keysToValues);
            }
            this.formatted = spannableStringBuilder;
        }
        return this.formatted;
    }

    public void into(TextView textView) {
        if (textView == null) {
            throw new IllegalArgumentException("TextView must not be null.");
        }
        textView.setText(format());
    }

    public Phrase put(String str, CharSequence charSequence) {
        if (!this.keys.contains(str)) {
            throw new IllegalArgumentException("Key '" + str + "' not found in '" + ((Object) this.pattern) + "'");
        }
        if (charSequence != null) {
            this.keysToValues.put(str, charSequence);
            this.formatted = null;
            return this;
        }
        throw new IllegalArgumentException("Null value for '" + str + "' in '" + ((Object) this.pattern) + "'");
    }

    public Phrase putOptional(String str, CharSequence charSequence) {
        return this.keys.contains(str) ? put(str, charSequence) : this;
    }

    public String toString() {
        return this.pattern.toString();
    }

    public static Phrase from(View view, @f1 int i10) {
        return from(view.getResources(), i10);
    }

    public Phrase putOptional(String str, int i10) {
        return this.keys.contains(str) ? put(str, i10) : this;
    }

    public static Phrase from(Context context, @f1 int i10) {
        return from(context.getResources(), i10);
    }

    public static Phrase from(Resources resources, @f1 int i10) {
        return from(resources.getText(i10));
    }

    public static Phrase from(CharSequence charSequence) {
        return new Phrase(charSequence);
    }

    public Phrase put(String str, int i10) {
        return put(str, Integer.toString(i10));
    }
}
