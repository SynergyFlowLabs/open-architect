package o4;

import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.net.Uri;
import coil.request.n;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nResourceUriMapper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ResourceUriMapper.kt\ncoil/map/ResourceUriMapper\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Uri.kt\nandroidx/core/net/UriKt\n*L\n1#1,34:1\n1#2:35\n29#3:36\n*S KotlinDebug\n*F\n+ 1 ResourceUriMapper.kt\ncoil/map/ResourceUriMapper\n*L\n25#1:36\n*E\n"})
public final class f implements d<Uri, Uri> {
    private final boolean b(Uri uri) {
        String authority;
        return Intrinsics.areEqual(uri.getScheme(), "android.resource") && (authority = uri.getAuthority()) != null && !StringsKt.w3(authority) && uri.getPathSegments().size() == 2;
    }

    @Override // o4.d
    @Nullable
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public Uri a(@NotNull Uri uri, @NotNull n nVar) throws PackageManager.NameNotFoundException {
        if (!b(uri)) {
            return null;
        }
        String authority = uri.getAuthority();
        if (authority == null) {
            authority = "";
        }
        Resources resourcesForApplication = nVar.g().getPackageManager().getResourcesForApplication(authority);
        List<String> pathSegments = uri.getPathSegments();
        int identifier = resourcesForApplication.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority);
        if (identifier == 0) {
            throw new IllegalStateException(("Invalid android.resource URI: " + uri).toString());
        }
        return Uri.parse("android.resource://" + authority + '/' + identifier);
    }
}
