package androidx.navigation.serialization;

import androidx.navigation.d3;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.k0;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nRouteBuilder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RouteBuilder.kt\nandroidx/navigation/serialization/RouteBuilder\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,111:1\n1863#2,2:112\n*S KotlinDebug\n*F\n+ 1 RouteBuilder.kt\nandroidx/navigation/serialization/RouteBuilder\n*L\n88#1:112,2\n*E\n"})
public final class g<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final KSerializer<T> f71274a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f71275b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private String f71276c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private String f71277d;

    private enum a {
        PATH,
        QUERY;


        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final /* synthetic */ kotlin.enums.a f71281d = kotlin.enums.c.c(k());

        @NotNull
        public static kotlin.enums.a<a> l() {
            return f71281d;
        }
    }

    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f71282a;

        static {
            int[] iArr = new int[a.values().length];
            try {
                iArr[a.PATH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a.QUERY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f71282a = iArr;
        }
    }

    public g(@NotNull KSerializer<T> serializer) {
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        this.f71276c = "";
        this.f71277d = "";
        this.f71274a = serializer;
        this.f71275b = serializer.getDescriptor().getSerialName();
    }

    private final void a(String str) {
        this.f71276c += '/' + str;
    }

    private final void b(String str, String str2) {
        this.f71277d += (this.f71277d.length() == 0 ? com.planner5d.library.model.payments.a.f222474i : "&") + str + '=' + str2;
    }

    private final a f(int i10, d3<Object> d3Var) {
        return ((d3Var instanceof androidx.navigation.q) || this.f71274a.getDescriptor().isElementOptional(i10)) ? a.QUERY : a.PATH;
    }

    public final void c(int i10, @NotNull String name, @NotNull d3<Object> type, @NotNull List<String> value) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(value, "value");
        int i11 = b.f71282a[f(i10, type).ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                throw new k0();
            }
            Iterator<T> it = value.iterator();
            while (it.hasNext()) {
                b(name, (String) it.next());
            }
            return;
        }
        if (value.size() == 1) {
            a((String) CollectionsKt.first((List) value));
            return;
        }
        throw new IllegalArgumentException(("Expected one value for argument " + name + ", found " + value.size() + "values instead.").toString());
    }

    public final void d(int i10, @NotNull String name, @NotNull d3<Object> type) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(type, "type");
        int i11 = b.f71282a[f(i10, type).ordinal()];
        if (i11 == 1) {
            a(AbstractJsonLexerKt.BEGIN_OBJ + name + AbstractJsonLexerKt.END_OBJ);
            return;
        }
        if (i11 != 2) {
            throw new k0();
        }
        b(name, AbstractJsonLexerKt.BEGIN_OBJ + name + AbstractJsonLexerKt.END_OBJ);
    }

    @NotNull
    public final String e() {
        return this.f71275b + this.f71276c + this.f71277d;
    }

    public g(@NotNull String path, @NotNull KSerializer<T> serializer) {
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        this.f71276c = "";
        this.f71277d = "";
        this.f71274a = serializer;
        this.f71275b = path;
    }
}
