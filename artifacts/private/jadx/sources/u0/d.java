package u0;

import android.content.res.Configuration;
import android.content.res.Resources;
import androidx.compose.runtime.internal.w0;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@w0(parameters = 0)
public final class d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f381106b = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final HashMap<b, WeakReference<a>> f381107a = new HashMap<>();

    @w0(parameters = 1)
    public static final class a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f381108c = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final androidx.compose.ui.graphics.vector.d f381109a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f381110b;

        public a(@NotNull androidx.compose.ui.graphics.vector.d dVar, int i10) {
            this.f381109a = dVar;
            this.f381110b = i10;
        }

        public static /* synthetic */ a d(a aVar, androidx.compose.ui.graphics.vector.d dVar, int i10, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                dVar = aVar.f381109a;
            }
            if ((i11 & 2) != 0) {
                i10 = aVar.f381110b;
            }
            return aVar.c(dVar, i10);
        }

        @NotNull
        public final androidx.compose.ui.graphics.vector.d a() {
            return this.f381109a;
        }

        public final int b() {
            return this.f381110b;
        }

        @NotNull
        public final a c(@NotNull androidx.compose.ui.graphics.vector.d dVar, int i10) {
            return new a(dVar, i10);
        }

        public final int e() {
            return this.f381110b;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.areEqual(this.f381109a, aVar.f381109a) && this.f381110b == aVar.f381110b;
        }

        @NotNull
        public final androidx.compose.ui.graphics.vector.d f() {
            return this.f381109a;
        }

        public int hashCode() {
            return (this.f381109a.hashCode() * 31) + Integer.hashCode(this.f381110b);
        }

        @NotNull
        public String toString() {
            return "ImageVectorEntry(imageVector=" + this.f381109a + ", configFlags=" + this.f381110b + ')';
        }
    }

    @w0(parameters = 0)
    public static final class b {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f381111c = 8;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final Resources.Theme f381112a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f381113b;

        public b(@NotNull Resources.Theme theme, int i10) {
            this.f381112a = theme;
            this.f381113b = i10;
        }

        public static /* synthetic */ b d(b bVar, Resources.Theme theme, int i10, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                theme = bVar.f381112a;
            }
            if ((i11 & 2) != 0) {
                i10 = bVar.f381113b;
            }
            return bVar.c(theme, i10);
        }

        @NotNull
        public final Resources.Theme a() {
            return this.f381112a;
        }

        public final int b() {
            return this.f381113b;
        }

        @NotNull
        public final b c(@NotNull Resources.Theme theme, int i10) {
            return new b(theme, i10);
        }

        public final int e() {
            return this.f381113b;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return Intrinsics.areEqual(this.f381112a, bVar.f381112a) && this.f381113b == bVar.f381113b;
        }

        @NotNull
        public final Resources.Theme f() {
            return this.f381112a;
        }

        public int hashCode() {
            return (this.f381112a.hashCode() * 31) + Integer.hashCode(this.f381113b);
        }

        @NotNull
        public String toString() {
            return "Key(theme=" + this.f381112a + ", id=" + this.f381113b + ')';
        }
    }

    public final void a() {
        this.f381107a.clear();
    }

    @Nullable
    public final a b(@NotNull b bVar) {
        WeakReference<a> weakReference = this.f381107a.get(bVar);
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public final void c(int i10) {
        Iterator<Map.Entry<b, WeakReference<a>>> it = this.f381107a.entrySet().iterator();
        while (it.hasNext()) {
            a aVar = it.next().getValue().get();
            if (aVar == null || Configuration.needNewResources(i10, aVar.e())) {
                it.remove();
            }
        }
    }

    public final void d(@NotNull b bVar, @NotNull a aVar) {
        this.f381107a.put(bVar, new WeakReference<>(aVar));
    }
}
