package androidx.compose.foundation.content.internal;

import androidx.compose.runtime.internal.w0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@w0(parameters = 1)
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f14010a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f14011b = 0;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final c a(@NotNull w.d dVar) {
            return new d(dVar);
        }

        private a() {
        }
    }

    @NotNull
    public abstract w.d a();

    public final boolean b(@NotNull w.g gVar) {
        return !Intrinsics.areEqual(a().a(gVar), gVar);
    }
}
