package ed;

import androidx.navigation.c2;
import kotlin.jvm.internal.Intrinsics;
import oj.g;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public interface d {

    @g
    public static final class a implements d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final Class<?> f274768a;

        private /* synthetic */ a(Class cls) {
            this.f274768a = cls;
        }

        public static final /* synthetic */ a a(Class cls) {
            return new a(cls);
        }

        @NotNull
        public static Class<?> b(@NotNull Class<?> destinationClass) {
            Intrinsics.checkNotNullParameter(destinationClass, "destinationClass");
            return destinationClass;
        }

        public static boolean c(Class<?> cls, Object obj) {
            if ((obj instanceof a) && Intrinsics.areEqual(cls, ((a) obj).h())) {
                return true;
            }
            return false;
        }

        public static final boolean d(Class<?> cls, Class<?> cls2) {
            return Intrinsics.areEqual(cls, cls2);
        }

        public static int f(Class<?> cls) {
            return cls.hashCode();
        }

        public static String g(Class<?> cls) {
            return "Class(destinationClass=" + cls + ")";
        }

        @NotNull
        public final Class<?> e() {
            return this.f274768a;
        }

        public boolean equals(Object obj) {
            return c(this.f274768a, obj);
        }

        public final /* synthetic */ Class h() {
            return this.f274768a;
        }

        public int hashCode() {
            return f(this.f274768a);
        }

        public String toString() {
            return g(this.f274768a);
        }
    }

    @g
    public static final class b implements d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final c2 f274769a;

        private /* synthetic */ b(c2 c2Var) {
            this.f274769a = c2Var;
        }

        public static final /* synthetic */ b a(c2 c2Var) {
            return new b(c2Var);
        }

        @NotNull
        public static c2 b(@NotNull c2 destinationDirection) {
            Intrinsics.checkNotNullParameter(destinationDirection, "destinationDirection");
            return destinationDirection;
        }

        public static boolean c(c2 c2Var, Object obj) {
            return (obj instanceof b) && Intrinsics.areEqual(c2Var, ((b) obj).h());
        }

        public static final boolean d(c2 c2Var, c2 c2Var2) {
            return Intrinsics.areEqual(c2Var, c2Var2);
        }

        public static int f(c2 c2Var) {
            return c2Var.hashCode();
        }

        public static String g(c2 c2Var) {
            return "NavigationDirection(destinationDirection=" + c2Var + ")";
        }

        @NotNull
        public final c2 e() {
            return this.f274769a;
        }

        public boolean equals(Object obj) {
            return c(this.f274769a, obj);
        }

        public final /* synthetic */ c2 h() {
            return this.f274769a;
        }

        public int hashCode() {
            return f(this.f274769a);
        }

        public String toString() {
            return g(this.f274769a);
        }
    }
}
