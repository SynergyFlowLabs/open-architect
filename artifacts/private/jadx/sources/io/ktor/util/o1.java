package io.ktor.util;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public interface o1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final a f296748c = a.f296749a;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ a f296749a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        private static final o1 f296750b = new t1(false, null, 3, 0 == true ? 1 : 0);

        private a() {
        }

        public static /* synthetic */ o1 b(a aVar, boolean z10, Function1 builder, int i10, Object obj) {
            int i11 = i10 & 1;
            int i12 = 0;
            if (i11 != 0) {
                z10 = false;
            }
            Intrinsics.checkNotNullParameter(builder, "builder");
            s1 s1Var = new s1(z10, i12, 2, null);
            builder.invoke(s1Var);
            return s1Var.build();
        }

        @NotNull
        public final o1 a(boolean z10, @NotNull Function1<? super p1, Unit> builder) {
            Intrinsics.checkNotNullParameter(builder, "builder");
            s1 s1Var = new s1(z10, 0, 2, null);
            builder.invoke(s1Var);
            return s1Var.build();
        }

        @NotNull
        public final o1 c() {
            return f296750b;
        }
    }

    @SourceDebugExtension({"SMAP\nStringValues.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StringValues.kt\nio/ktor/util/StringValues$DefaultImpls\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,472:1\n1869#2,2:473\n*S KotlinDebug\n*F\n+ 1 StringValues.kt\nio/ktor/util/StringValues$DefaultImpls\n*L\n91#1:473,2\n*E\n"})
    public static final class b {
        public static boolean a(@NotNull o1 o1Var, @NotNull String name) {
            Intrinsics.checkNotNullParameter(name, "name");
            return o1Var.b(name) != null;
        }

        public static boolean b(@NotNull o1 o1Var, @NotNull String name, @NotNull String value) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(value, "value");
            List<String> listB = o1Var.b(name);
            if (listB != null) {
                return listB.contains(value);
            }
            return false;
        }

        public static void c(@NotNull o1 o1Var, @NotNull Function2<? super String, ? super List<String>, Unit> body) {
            Intrinsics.checkNotNullParameter(body, "body");
            Iterator<T> it = o1Var.k().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                body.invoke((String) entry.getKey(), (List) entry.getValue());
            }
        }

        @Nullable
        public static String d(@NotNull o1 o1Var, @NotNull String name) {
            Intrinsics.checkNotNullParameter(name, "name");
            List<String> listB = o1Var.b(name);
            if (listB != null) {
                return (String) CollectionsKt.firstOrNull((List) listB);
            }
            return null;
        }
    }

    @Nullable
    List<String> b(@NotNull String str);

    boolean c();

    boolean contains(@NotNull String str);

    boolean d(@NotNull String str, @NotNull String str2);

    void e(@NotNull Function2<? super String, ? super List<String>, Unit> function2);

    @Nullable
    String get(@NotNull String str);

    boolean isEmpty();

    @NotNull
    Set<Map.Entry<String, List<String>>> k();

    @NotNull
    Set<String> names();
}
