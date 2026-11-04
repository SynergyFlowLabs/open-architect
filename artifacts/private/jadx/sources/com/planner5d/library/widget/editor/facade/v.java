package com.planner5d.library.widget.editor.facade;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
public interface v {

    public static final class a {
        public static void a(@NotNull v vVar, @Nullable String str, @Nullable String str2) {
            vVar.b(str, str2, null);
        }

        public static /* synthetic */ void b(v vVar, String str, String str2, Throwable th2, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: log");
            }
            if ((i10 & 4) != 0) {
                th2 = null;
            }
            vVar.b(str, str2, th2);
        }
    }

    void b(@Nullable String str, @Nullable String str2, @Nullable Throwable th2);

    void d(@Nullable String str, @Nullable String str2);
}
