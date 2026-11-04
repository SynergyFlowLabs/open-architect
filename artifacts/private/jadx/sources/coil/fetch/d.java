package coil.fetch;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.graphics.Point;
import android.net.Uri;
import android.os.Bundle;
import androidx.annotation.l1;
import coil.decode.a0;
import coil.request.n;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import okio.l0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nContentUriFetcher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContentUriFetcher.kt\ncoil/fetch/ContentUriFetcher\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,100:1\n1#2:101\n*E\n"})
public final class d implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Uri f87349a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final n f87350b;

    public static final class a implements h.a<Uri> {
        private final boolean c(Uri uri) {
            return Intrinsics.areEqual(uri.getScheme(), FirebaseAnalytics.d.P);
        }

        @Override // coil.fetch.h.a
        @Nullable
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public h a(@NotNull Uri uri, @NotNull n nVar, @NotNull coil.j jVar) {
            if (c(uri)) {
                return new d(uri, nVar);
            }
            return null;
        }
    }

    public d(@NotNull Uri uri, @NotNull n nVar) {
        this.f87349a = uri;
        this.f87350b = nVar;
    }

    private final Bundle d() {
        coil.size.c cVarF = this.f87350b.p().f();
        coil.size.c.a aVar = cVarF instanceof coil.size.c.a ? (coil.size.c.a) cVarF : null;
        if (aVar != null) {
            int i10 = aVar.f87767a;
            coil.size.c cVarE = this.f87350b.p().e();
            coil.size.c.a aVar2 = cVarE instanceof coil.size.c.a ? (coil.size.c.a) cVarE : null;
            if (aVar2 != null) {
                int i11 = aVar2.f87767a;
                Bundle bundle = new Bundle(1);
                bundle.putParcelable("android.content.extra.SIZE", new Point(i10, i11));
                return bundle;
            }
        }
        return null;
    }

    @Override // coil.fetch.h
    @Nullable
    public Object a(@NotNull kotlin.coroutines.d<? super g> dVar) throws FileNotFoundException {
        InputStream inputStreamOpenInputStream;
        ContentResolver contentResolver = this.f87350b.g().getContentResolver();
        if (b(this.f87349a)) {
            AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor = contentResolver.openAssetFileDescriptor(this.f87349a, "r");
            inputStreamOpenInputStream = assetFileDescriptorOpenAssetFileDescriptor != null ? assetFileDescriptorOpenAssetFileDescriptor.createInputStream() : null;
            if (inputStreamOpenInputStream == null) {
                throw new IllegalStateException(("Unable to find a contact photo associated with '" + this.f87349a + "'.").toString());
            }
        } else if (c(this.f87349a)) {
            AssetFileDescriptor assetFileDescriptorOpenTypedAssetFile = contentResolver.openTypedAssetFile(this.f87349a, "image/*", d(), null);
            inputStreamOpenInputStream = assetFileDescriptorOpenTypedAssetFile != null ? assetFileDescriptorOpenTypedAssetFile.createInputStream() : null;
            if (inputStreamOpenInputStream == null) {
                throw new IllegalStateException(("Unable to find a music thumbnail associated with '" + this.f87349a + "'.").toString());
            }
        } else {
            inputStreamOpenInputStream = contentResolver.openInputStream(this.f87349a);
            if (inputStreamOpenInputStream == null) {
                throw new IllegalStateException(("Unable to open '" + this.f87349a + "'.").toString());
            }
        }
        return new m(a0.j(l0.e(l0.u(inputStreamOpenInputStream)), this.f87350b.g(), new coil.decode.d(this.f87349a)), contentResolver.getType(this.f87349a), coil.decode.e.DISK);
    }

    @l1
    public final boolean b(@NotNull Uri uri) {
        return Intrinsics.areEqual(uri.getAuthority(), "com.android.contacts") && Intrinsics.areEqual(uri.getLastPathSegment(), "display_photo");
    }

    @l1
    public final boolean c(@NotNull Uri uri) {
        int i10 = 2 >> 0;
        if (!Intrinsics.areEqual(uri.getAuthority(), "media")) {
            return false;
        }
        List<String> pathSegments = uri.getPathSegments();
        int size = pathSegments.size();
        return size >= 3 && Intrinsics.areEqual(pathSegments.get(size + (-3)), "audio") && Intrinsics.areEqual(pathSegments.get(size + (-2)), "albums");
    }
}
