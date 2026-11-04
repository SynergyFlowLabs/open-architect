package io.ktor.util;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public interface t0 {

    public static final class a {
        public static /* synthetic */ void a(t0 t0Var, byte[] bArr, int i10, int i11, int i12, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: update");
            }
            if ((i12 & 2) != 0) {
                i10 = 0;
            }
            if ((i12 & 4) != 0) {
                i11 = bArr.length;
            }
            t0Var.update(bArr, i10, i11);
        }
    }

    @NotNull
    byte[] a();

    void update(@NotNull byte[] bArr, int i10, int i11);
}
