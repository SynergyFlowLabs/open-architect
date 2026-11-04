package io.noties.markwon.utils;

import androidx.annotation.NonNull;
import org.commonmark.node.v;

/* JADX INFO: loaded from: classes8.dex */
public abstract class h {
    private h() {
    }

    public static void a(@NonNull v vVar, @NonNull v vVar2) {
        v vVarG = vVar2.g();
        while (vVarG != null) {
            v vVarG2 = vVarG.g();
            vVar.d(vVarG);
            vVarG = vVarG2;
        }
    }
}
