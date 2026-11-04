package timber.log;

import android.util.Log;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Unit;
import kotlin.b1;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.l;
import kotlin.text.StringsKt;
import lm.k;
import oj.i;
import oj.n;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes14.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final C2515b f381052a = new C2515b(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private static final ArrayList<c> f381053b = new ArrayList<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private static volatile c[] f381054c = new c[0];

    public static class a extends c {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final int f381056d = 4000;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final int f381057e = 23;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        private final List<String> f381059b = CollectionsKt.listOf((Object[]) new String[]{b.class.getName(), C2515b.class.getName(), c.class.getName(), a.class.getName()});

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public static final C2514a f381055c = new C2514a(null);

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final Pattern f381058f = Pattern.compile("(\\$\\d+)+$");

        /* JADX INFO: renamed from: timber.log.b$a$a, reason: collision with other inner class name */
        public static final class C2514a {
            public /* synthetic */ C2514a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private C2514a() {
            }
        }

        @Nullable
        protected String D(@NotNull StackTraceElement element) {
            Intrinsics.checkNotNullParameter(element, "element");
            String className = element.getClassName();
            Intrinsics.checkNotNullExpressionValue(className, "element.className");
            String strS5 = StringsKt.s5(className, '.', null, 2, null);
            Matcher matcher = f381058f.matcher(strS5);
            if (matcher.find()) {
                strS5 = matcher.replaceAll("");
                Intrinsics.checkNotNullExpressionValue(strS5, "m.replaceAll(\"\")");
            }
            strS5.length();
            return strS5;
        }

        @Override // timber.log.b.c
        @Nullable
        public String j() {
            String strJ = super.j();
            if (strJ != null) {
                return strJ;
            }
            StackTraceElement[] stackTrace = new Throwable().getStackTrace();
            Intrinsics.checkNotNullExpressionValue(stackTrace, "Throwable().stackTrace");
            for (StackTraceElement stackTraceElement : stackTrace) {
                if (!this.f381059b.contains(stackTraceElement.getClassName())) {
                    return D(stackTraceElement);
                }
            }
            throw new NoSuchElementException("Array contains no element matching the predicate.");
        }

        @Override // timber.log.b.c
        protected void p(int i10, @Nullable String str, @NotNull String message, @Nullable Throwable th2) {
            int iMin;
            Intrinsics.checkNotNullParameter(message, "message");
            if (message.length() < f381056d) {
                if (i10 == 7) {
                    Log.wtf(str, message);
                    return;
                } else {
                    Log.println(i10, str, message);
                    return;
                }
            }
            int length = message.length();
            int i11 = 0;
            while (i11 < length) {
                String str2 = message;
                int iQ3 = StringsKt.q3(str2, '\n', i11, false, 4, null);
                if (iQ3 == -1) {
                    iQ3 = length;
                }
                while (true) {
                    iMin = Math.min(iQ3, i11 + f381056d);
                    String strSubstring = str2.substring(i11, iMin);
                    Intrinsics.checkNotNullExpressionValue(strSubstring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    if (i10 == 7) {
                        Log.wtf(str, strSubstring);
                    } else {
                        Log.println(i10, str, strSubstring);
                    }
                    if (iMin >= iQ3) {
                        break;
                    } else {
                        i11 = iMin;
                    }
                }
                i11 = iMin + 1;
                message = str2;
            }
        }
    }

    /* JADX INFO: renamed from: timber.log.b$b, reason: collision with other inner class name */
    public static final class C2515b extends c {
        public /* synthetic */ C2515b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // timber.log.b.c
        @n
        public void A(@k @Nullable String str, @NotNull Object... args) {
            Intrinsics.checkNotNullParameter(args, "args");
            for (c cVar : b.f381054c) {
                cVar.A(str, Arrays.copyOf(args, args.length));
            }
        }

        @Override // timber.log.b.c
        @n
        public void B(@Nullable Throwable th2) {
            for (c cVar : b.f381054c) {
                cVar.B(th2);
            }
        }

        @Override // timber.log.b.c
        @n
        public void C(@Nullable Throwable th2, @k @Nullable String str, @NotNull Object... args) {
            Intrinsics.checkNotNullParameter(args, "args");
            for (c cVar : b.f381054c) {
                cVar.C(th2, str, Arrays.copyOf(args, args.length));
            }
        }

        @n
        @NotNull
        public c D() {
            return this;
        }

        @n
        @NotNull
        public final List<c> E() {
            List<c> listUnmodifiableList;
            synchronized (b.f381053b) {
                listUnmodifiableList = Collections.unmodifiableList(CollectionsKt.toList(b.f381053b));
                Intrinsics.checkNotNullExpressionValue(listUnmodifiableList, "unmodifiableList(trees.toList())");
            }
            return listUnmodifiableList;
        }

        @n
        public final void F(@NotNull c tree) {
            Intrinsics.checkNotNullParameter(tree, "tree");
            if (!(tree != this)) {
                throw new IllegalArgumentException("Cannot plant Timber into itself.");
            }
            synchronized (b.f381053b) {
                try {
                    b.f381053b.add(tree);
                    C2515b c2515b = b.f381052a;
                    Object[] array = b.f381053b.toArray(new c[0]);
                    if (array == null) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                    }
                    b.f381054c = (c[]) array;
                    Unit unit = Unit.f312394a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @n
        public final void G(@NotNull c... trees) {
            Intrinsics.checkNotNullParameter(trees, "trees");
            int length = trees.length;
            int i10 = 0;
            while (i10 < length) {
                c cVar = trees[i10];
                i10++;
                if (cVar == null) {
                    throw new IllegalArgumentException("trees contained null");
                }
                if (!(cVar != this)) {
                    throw new IllegalArgumentException("Cannot plant Timber into itself.");
                }
            }
            synchronized (b.f381053b) {
                try {
                    Collections.addAll(b.f381053b, Arrays.copyOf(trees, trees.length));
                    C2515b c2515b = b.f381052a;
                    Object[] array = b.f381053b.toArray(new c[0]);
                    if (array == null) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                    }
                    b.f381054c = (c[]) array;
                    Unit unit = Unit.f312394a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @n
        @NotNull
        public final c H(@NotNull String tag) {
            Intrinsics.checkNotNullParameter(tag, "tag");
            c[] cVarArr = b.f381054c;
            int length = cVarArr.length;
            int i10 = 0;
            while (i10 < length) {
                c cVar = cVarArr[i10];
                i10++;
                cVar.h().set(tag);
            }
            return this;
        }

        @n
        @i(name = "treeCount")
        public final int I() {
            return b.f381054c.length;
        }

        @n
        public final void J(@NotNull c tree) {
            Intrinsics.checkNotNullParameter(tree, "tree");
            synchronized (b.f381053b) {
                try {
                    if (!b.f381053b.remove(tree)) {
                        throw new IllegalArgumentException(Intrinsics.stringPlus("Cannot uproot tree which is not planted: ", tree).toString());
                    }
                    C2515b c2515b = b.f381052a;
                    Object[] array = b.f381053b.toArray(new c[0]);
                    if (array == null) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                    }
                    b.f381054c = (c[]) array;
                    Unit unit = Unit.f312394a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @n
        public final void K() {
            synchronized (b.f381053b) {
                b.f381053b.clear();
                C2515b c2515b = b.f381052a;
                b.f381054c = new c[0];
                Unit unit = Unit.f312394a;
            }
        }

        @Override // timber.log.b.c
        @n
        public void a(@k @Nullable String str, @NotNull Object... args) {
            Intrinsics.checkNotNullParameter(args, "args");
            for (c cVar : b.f381054c) {
                cVar.a(str, Arrays.copyOf(args, args.length));
            }
        }

        @Override // timber.log.b.c
        @n
        public void b(@Nullable Throwable th2) {
            for (c cVar : b.f381054c) {
                cVar.b(th2);
            }
        }

        @Override // timber.log.b.c
        @n
        public void c(@Nullable Throwable th2, @k @Nullable String str, @NotNull Object... args) {
            Intrinsics.checkNotNullParameter(args, "args");
            for (c cVar : b.f381054c) {
                cVar.c(th2, str, Arrays.copyOf(args, args.length));
            }
        }

        @Override // timber.log.b.c
        @n
        public void d(@k @Nullable String str, @NotNull Object... args) {
            Intrinsics.checkNotNullParameter(args, "args");
            for (c cVar : b.f381054c) {
                cVar.d(str, Arrays.copyOf(args, args.length));
            }
        }

        @Override // timber.log.b.c
        @n
        public void e(@Nullable Throwable th2) {
            for (c cVar : b.f381054c) {
                cVar.e(th2);
            }
        }

        @Override // timber.log.b.c
        @n
        public void f(@Nullable Throwable th2, @k @Nullable String str, @NotNull Object... args) {
            Intrinsics.checkNotNullParameter(args, "args");
            for (c cVar : b.f381054c) {
                cVar.f(th2, str, Arrays.copyOf(args, args.length));
            }
        }

        @Override // timber.log.b.c
        @n
        public void k(@k @Nullable String str, @NotNull Object... args) {
            Intrinsics.checkNotNullParameter(args, "args");
            for (c cVar : b.f381054c) {
                cVar.k(str, Arrays.copyOf(args, args.length));
            }
        }

        @Override // timber.log.b.c
        @n
        public void l(@Nullable Throwable th2) {
            for (c cVar : b.f381054c) {
                cVar.l(th2);
            }
        }

        @Override // timber.log.b.c
        @n
        public void m(@Nullable Throwable th2, @k @Nullable String str, @NotNull Object... args) {
            Intrinsics.checkNotNullParameter(args, "args");
            for (c cVar : b.f381054c) {
                cVar.m(th2, str, Arrays.copyOf(args, args.length));
            }
        }

        @Override // timber.log.b.c
        protected void p(int i10, @Nullable String str, @NotNull String message, @Nullable Throwable th2) {
            Intrinsics.checkNotNullParameter(message, "message");
            throw new AssertionError();
        }

        @Override // timber.log.b.c
        @n
        public void q(int i10, @k @Nullable String str, @NotNull Object... args) {
            Intrinsics.checkNotNullParameter(args, "args");
            for (c cVar : b.f381054c) {
                cVar.q(i10, str, Arrays.copyOf(args, args.length));
            }
        }

        @Override // timber.log.b.c
        @n
        public void r(int i10, @Nullable Throwable th2) {
            for (c cVar : b.f381054c) {
                cVar.r(i10, th2);
            }
        }

        @Override // timber.log.b.c
        @n
        public void s(int i10, @Nullable Throwable th2, @k @Nullable String str, @NotNull Object... args) {
            Intrinsics.checkNotNullParameter(args, "args");
            for (c cVar : b.f381054c) {
                cVar.s(i10, th2, str, Arrays.copyOf(args, args.length));
            }
        }

        @Override // timber.log.b.c
        @n
        public void u(@k @Nullable String str, @NotNull Object... args) {
            Intrinsics.checkNotNullParameter(args, "args");
            for (c cVar : b.f381054c) {
                cVar.u(str, Arrays.copyOf(args, args.length));
            }
        }

        @Override // timber.log.b.c
        @n
        public void v(@Nullable Throwable th2) {
            for (c cVar : b.f381054c) {
                cVar.v(th2);
            }
        }

        @Override // timber.log.b.c
        @n
        public void w(@Nullable Throwable th2, @k @Nullable String str, @NotNull Object... args) {
            Intrinsics.checkNotNullParameter(args, "args");
            for (c cVar : b.f381054c) {
                cVar.w(th2, str, Arrays.copyOf(args, args.length));
            }
        }

        @Override // timber.log.b.c
        @n
        public void x(@k @Nullable String str, @NotNull Object... args) {
            Intrinsics.checkNotNullParameter(args, "args");
            for (c cVar : b.f381054c) {
                cVar.x(str, Arrays.copyOf(args, args.length));
            }
        }

        @Override // timber.log.b.c
        @n
        public void y(@Nullable Throwable th2) {
            for (c cVar : b.f381054c) {
                cVar.y(th2);
            }
        }

        @Override // timber.log.b.c
        @n
        public void z(@Nullable Throwable th2, @k @Nullable String str, @NotNull Object... args) {
            Intrinsics.checkNotNullParameter(args, "args");
            for (c cVar : b.f381054c) {
                cVar.z(th2, str, Arrays.copyOf(args, args.length));
            }
        }

        private C2515b() {
        }
    }

    public static abstract class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final ThreadLocal<String> f381060a = new ThreadLocal<>();

        private final String i(Throwable th2) {
            StringWriter stringWriter = new StringWriter(256);
            PrintWriter printWriter = new PrintWriter((Writer) stringWriter, false);
            th2.printStackTrace(printWriter);
            printWriter.flush();
            String string = stringWriter.toString();
            Intrinsics.checkNotNullExpressionValue(string, "sw.toString()");
            return string;
        }

        private final void t(int i10, Throwable th2, String str, Object... objArr) {
            String strJ = j();
            if (o(strJ, i10)) {
                if (str != null && str.length() != 0) {
                    if (!(objArr.length == 0)) {
                        str = g(str, objArr);
                    }
                    if (th2 != null) {
                        str = ((Object) str) + '\n' + i(th2);
                    }
                } else if (th2 != null) {
                    str = i(th2);
                }
                p(i10, strJ, str, th2);
            }
        }

        public void A(@Nullable String str, @NotNull Object... args) {
            Intrinsics.checkNotNullParameter(args, "args");
            t(7, null, str, Arrays.copyOf(args, args.length));
        }

        public void B(@Nullable Throwable th2) {
            t(7, th2, null, new Object[0]);
        }

        public void C(@Nullable Throwable th2, @Nullable String str, @NotNull Object... args) {
            Intrinsics.checkNotNullParameter(args, "args");
            t(7, th2, str, Arrays.copyOf(args, args.length));
        }

        public void a(@Nullable String str, @NotNull Object... args) {
            Intrinsics.checkNotNullParameter(args, "args");
            t(3, null, str, Arrays.copyOf(args, args.length));
        }

        public void b(@Nullable Throwable th2) {
            t(3, th2, null, new Object[0]);
        }

        public void c(@Nullable Throwable th2, @Nullable String str, @NotNull Object... args) {
            Intrinsics.checkNotNullParameter(args, "args");
            t(3, th2, str, Arrays.copyOf(args, args.length));
        }

        public void d(@Nullable String str, @NotNull Object... args) {
            Intrinsics.checkNotNullParameter(args, "args");
            t(6, null, str, Arrays.copyOf(args, args.length));
        }

        public void e(@Nullable Throwable th2) {
            t(6, th2, null, new Object[0]);
        }

        public void f(@Nullable Throwable th2, @Nullable String str, @NotNull Object... args) {
            Intrinsics.checkNotNullParameter(args, "args");
            t(6, th2, str, Arrays.copyOf(args, args.length));
        }

        @NotNull
        protected String g(@NotNull String message, @NotNull Object[] args) {
            Intrinsics.checkNotNullParameter(message, "message");
            Intrinsics.checkNotNullParameter(args, "args");
            Object[] objArrCopyOf = Arrays.copyOf(args, args.length);
            String str = String.format(message, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
            Intrinsics.checkNotNullExpressionValue(str, "java.lang.String.format(this, *args)");
            return str;
        }

        public final /* synthetic */ ThreadLocal h() {
            return this.f381060a;
        }

        public /* synthetic */ String j() {
            String str = this.f381060a.get();
            if (str != null) {
                this.f381060a.remove();
            }
            return str;
        }

        public void k(@Nullable String str, @NotNull Object... args) {
            Intrinsics.checkNotNullParameter(args, "args");
            t(4, null, str, Arrays.copyOf(args, args.length));
        }

        public void l(@Nullable Throwable th2) {
            t(4, th2, null, new Object[0]);
        }

        public void m(@Nullable Throwable th2, @Nullable String str, @NotNull Object... args) {
            Intrinsics.checkNotNullParameter(args, "args");
            int i10 = 4 | 4;
            t(4, th2, str, Arrays.copyOf(args, args.length));
        }

        @l(message = "Use isLoggable(String, int)", replaceWith = @b1(expression = "this.isLoggable(null, priority)", imports = {}))
        protected boolean n(int i10) {
            return true;
        }

        protected boolean o(@Nullable String str, int i10) {
            return n(i10);
        }

        protected abstract void p(int i10, @Nullable String str, @NotNull String str2, @Nullable Throwable th2);

        public void q(int i10, @Nullable String str, @NotNull Object... args) {
            Intrinsics.checkNotNullParameter(args, "args");
            t(i10, null, str, Arrays.copyOf(args, args.length));
        }

        public void r(int i10, @Nullable Throwable th2) {
            t(i10, th2, null, new Object[0]);
        }

        public void s(int i10, @Nullable Throwable th2, @Nullable String str, @NotNull Object... args) {
            Intrinsics.checkNotNullParameter(args, "args");
            t(i10, th2, str, Arrays.copyOf(args, args.length));
        }

        public void u(@Nullable String str, @NotNull Object... args) {
            Intrinsics.checkNotNullParameter(args, "args");
            t(2, null, str, Arrays.copyOf(args, args.length));
        }

        public void v(@Nullable Throwable th2) {
            t(2, th2, null, new Object[0]);
        }

        public void w(@Nullable Throwable th2, @Nullable String str, @NotNull Object... args) {
            Intrinsics.checkNotNullParameter(args, "args");
            t(2, th2, str, Arrays.copyOf(args, args.length));
        }

        public void x(@Nullable String str, @NotNull Object... args) {
            Intrinsics.checkNotNullParameter(args, "args");
            t(5, null, str, Arrays.copyOf(args, args.length));
        }

        public void y(@Nullable Throwable th2) {
            t(5, th2, null, new Object[0]);
        }

        public void z(@Nullable Throwable th2, @Nullable String str, @NotNull Object... args) {
            Intrinsics.checkNotNullParameter(args, "args");
            int i10 = 7 << 5;
            t(5, th2, str, Arrays.copyOf(args, args.length));
        }
    }

    private b() {
        throw new AssertionError();
    }

    @n
    public static void A(@k @Nullable String str, @NotNull Object... objArr) {
        f381052a.x(str, objArr);
    }

    @n
    public static void B(@Nullable Throwable th2) {
        f381052a.y(th2);
    }

    @n
    public static void C(@Nullable Throwable th2, @k @Nullable String str, @NotNull Object... objArr) {
        f381052a.z(th2, str, objArr);
    }

    @n
    public static void D(@k @Nullable String str, @NotNull Object... objArr) {
        f381052a.A(str, objArr);
    }

    @n
    public static void E(@Nullable Throwable th2) {
        f381052a.B(th2);
    }

    @n
    public static void F(@Nullable Throwable th2, @k @Nullable String str, @NotNull Object... objArr) {
        f381052a.C(th2, str, objArr);
    }

    @n
    @NotNull
    public static c d() {
        return f381052a.D();
    }

    @n
    public static void e(@k @Nullable String str, @NotNull Object... objArr) {
        f381052a.a(str, objArr);
    }

    @n
    public static void f(@Nullable Throwable th2) {
        f381052a.b(th2);
    }

    @n
    public static void g(@Nullable Throwable th2, @k @Nullable String str, @NotNull Object... objArr) {
        f381052a.c(th2, str, objArr);
    }

    @n
    public static void h(@k @Nullable String str, @NotNull Object... objArr) {
        f381052a.d(str, objArr);
    }

    @n
    public static void i(@Nullable Throwable th2) {
        f381052a.e(th2);
    }

    @n
    public static void j(@Nullable Throwable th2, @k @Nullable String str, @NotNull Object... objArr) {
        f381052a.f(th2, str, objArr);
    }

    @n
    @NotNull
    public static final List<c> k() {
        return f381052a.E();
    }

    @n
    public static void l(@k @Nullable String str, @NotNull Object... objArr) {
        f381052a.k(str, objArr);
    }

    @n
    public static void m(@Nullable Throwable th2) {
        f381052a.l(th2);
    }

    @n
    public static void n(@Nullable Throwable th2, @k @Nullable String str, @NotNull Object... objArr) {
        f381052a.m(th2, str, objArr);
    }

    @n
    public static void o(int i10, @k @Nullable String str, @NotNull Object... objArr) {
        f381052a.q(i10, str, objArr);
    }

    @n
    public static void p(int i10, @Nullable Throwable th2) {
        f381052a.r(i10, th2);
    }

    @n
    public static void q(int i10, @Nullable Throwable th2, @k @Nullable String str, @NotNull Object... objArr) {
        f381052a.s(i10, th2, str, objArr);
    }

    @n
    public static final void r(@NotNull c cVar) {
        f381052a.F(cVar);
    }

    @n
    public static final void s(@NotNull c... cVarArr) {
        f381052a.G(cVarArr);
    }

    @n
    @NotNull
    public static final c t(@NotNull String str) {
        return f381052a.H(str);
    }

    @n
    @i(name = "treeCount")
    public static final int u() {
        return f381052a.I();
    }

    @n
    public static final void v(@NotNull c cVar) {
        f381052a.J(cVar);
    }

    @n
    public static final void w() {
        f381052a.K();
    }

    @n
    public static void x(@k @Nullable String str, @NotNull Object... objArr) {
        f381052a.u(str, objArr);
    }

    @n
    public static void y(@Nullable Throwable th2) {
        f381052a.v(th2);
    }

    @n
    public static void z(@Nullable Throwable th2, @k @Nullable String str, @NotNull Object... objArr) {
        f381052a.w(th2, str, objArr);
    }
}
