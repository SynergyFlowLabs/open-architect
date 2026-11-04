package vf;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class a implements d {
    @Override // vf.d
    public void a(@NotNull c log) {
        Intrinsics.checkNotNullParameter(log, "log");
        System.out.println((Object) ("[Segment " + log.g() + ' ' + log.h()));
    }
}
