package androidx.core.view.accessibility;

import android.os.Bundle;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.b1;
import androidx.annotation.p0;

/* JADX INFO: loaded from: classes2.dex */
public interface m {

    public static abstract class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Bundle f48597a;

        @b1({b1.a.LIBRARY_GROUP_PREFIX})
        public void a(@p0 Bundle bundle) {
            this.f48597a = bundle;
        }
    }

    public static final class b extends a {
        public boolean b() {
            return this.f48597a.getBoolean(j.Y);
        }

        public int c() {
            return this.f48597a.getInt(j.W);
        }
    }

    public static final class c extends a {
        @p0
        public String b() {
            return this.f48597a.getString(j.X);
        }
    }

    public static final class d extends a {
        public int b() {
            return this.f48597a.getInt(j.f48498f0);
        }

        public int c() {
            return this.f48597a.getInt(j.f48500g0);
        }
    }

    public static final class e extends a {
        public int b() {
            return this.f48597a.getInt(j.f48494d0);
        }

        public int c() {
            return this.f48597a.getInt(j.f48492c0);
        }
    }

    public static final class f extends a {
        public float b() {
            return this.f48597a.getFloat(j.f48496e0);
        }
    }

    public static final class g extends a {
        public int b() {
            return this.f48597a.getInt(j.f48490a0);
        }

        public int c() {
            return this.f48597a.getInt(j.Z);
        }
    }

    public static final class h extends a {
        @p0
        public CharSequence b() {
            return this.f48597a.getCharSequence(j.f48491b0);
        }
    }

    boolean a(@NonNull View view, @p0 a aVar);
}
