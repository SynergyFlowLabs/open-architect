package coil.fetch;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.TypedValue;
import android.webkit.MimeTypeMap;
import coil.decode.b0;
import coil.request.n;
import coil.util.s;
import java.util.List;
import kotlin.a0;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import okio.l0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nResourceUriFetcher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ResourceUriFetcher.kt\ncoil/fetch/ResourceUriFetcher\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Bitmaps.kt\ncoil/util/-Bitmaps\n+ 4 BitmapDrawable.kt\nandroidx/core/graphics/drawable/BitmapDrawableKt\n*L\n1#1,100:1\n1#2:101\n50#3:102\n28#4:103\n*S KotlinDebug\n*F\n+ 1 ResourceUriFetcher.kt\ncoil/fetch/ResourceUriFetcher\n*L\n58#1:102\n58#1:103\n*E\n"})
public final class l implements h {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final a f87384c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private static final String f87385d = "text/xml";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Uri f87386a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final n f87387b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public static final class b implements h.a<Uri> {
        private final boolean c(Uri uri) {
            return Intrinsics.areEqual(uri.getScheme(), "android.resource");
        }

        @Override // coil.fetch.h.a
        @Nullable
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public h a(@NotNull Uri uri, @NotNull n nVar, @NotNull coil.j jVar) {
            if (c(uri)) {
                return new l(uri, nVar);
            }
            return null;
        }
    }

    public l(@NotNull Uri uri, @NotNull n nVar) {
        this.f87386a = uri;
        this.f87387b = nVar;
    }

    private final Void b(Uri uri) {
        throw new IllegalStateException("Invalid android.resource URI: " + uri);
    }

    @Override // coil.fetch.h
    @Nullable
    public Object a(@NotNull kotlin.coroutines.d<? super g> dVar) {
        Integer intOrNull;
        String authority = this.f87386a.getAuthority();
        if (authority != null) {
            if (StringsKt.w3(authority)) {
                authority = null;
            }
            if (authority != null) {
                String str = (String) CollectionsKt.lastOrNull((List) this.f87386a.getPathSegments());
                if (str == null || (intOrNull = StringsKt.toIntOrNull(str)) == null) {
                    b(this.f87386a);
                    throw new a0();
                }
                int iIntValue = intOrNull.intValue();
                Context contextG = this.f87387b.g();
                Resources resources = Intrinsics.areEqual(authority, contextG.getPackageName()) ? contextG.getResources() : contextG.getPackageManager().getResourcesForApplication(authority);
                TypedValue typedValue = new TypedValue();
                resources.getValue(iIntValue, typedValue, true);
                CharSequence charSequence = typedValue.string;
                String strQ = coil.util.l.q(MimeTypeMap.getSingleton(), charSequence.subSequence(StringsKt.F3(charSequence, '/', 0, false, 6, null), charSequence.length()).toString());
                if (!Intrinsics.areEqual(strQ, f87385d)) {
                    TypedValue typedValue2 = new TypedValue();
                    return new m(coil.decode.a0.j(l0.e(l0.u(resources.openRawResource(iIntValue, typedValue2))), contextG, new b0(authority, iIntValue, typedValue2.density)), strQ, coil.decode.e.DISK);
                }
                Drawable drawableA = Intrinsics.areEqual(authority, contextG.getPackageName()) ? coil.util.d.a(contextG, iIntValue) : coil.util.d.d(contextG, resources, iIntValue);
                boolean zD = coil.util.l.D(drawableA);
                if (zD) {
                    drawableA = new BitmapDrawable(contextG.getResources(), s.f87858a.a(drawableA, this.f87387b.f(), this.f87387b.p(), this.f87387b.o(), this.f87387b.c()));
                }
                return new f(drawableA, zD, coil.decode.e.DISK);
            }
        }
        b(this.f87386a);
        throw new a0();
    }
}
