package org.msgpack.core;

import java.nio.charset.CharacterCodingException;

/* JADX INFO: loaded from: classes14.dex */
public class l extends i {
    public l(String str, CharacterCodingException characterCodingException) {
        super(str, characterCodingException);
    }

    @Override // java.lang.Throwable
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public CharacterCodingException getCause() {
        return (CharacterCodingException) super.getCause();
    }

    public l(CharacterCodingException characterCodingException) {
        super(characterCodingException);
    }
}
