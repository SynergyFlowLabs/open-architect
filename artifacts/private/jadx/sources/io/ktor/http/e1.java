package io.ktor.http;

import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes5.dex */
public final class e1 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean b(char c10) {
        return StringsKt.U2("\"(),/:;<=>?@[\\]{}", c10, false, 2, null);
    }
}
