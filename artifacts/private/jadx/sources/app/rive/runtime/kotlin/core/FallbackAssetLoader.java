package app.rive.runtime.kotlin.core;

import android.content.Context;
import androidx.annotation.l1;
import app.rive.runtime.kotlin.RiveAnimationView;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nFileAssetLoader.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FileAssetLoader.kt\napp/rive/runtime/kotlin/core/FallbackAssetLoader\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,140:1\n1#2:141\n1755#3,3:142\n360#3,7:145\n*S KotlinDebug\n*F\n+ 1 FileAssetLoader.kt\napp/rive/runtime/kotlin/core/FallbackAssetLoader\n*L\n71#1:142,3\n76#1:145,7\n*E\n"})
public final class FallbackAssetLoader extends FileAssetLoader {

    @NotNull
    private final List<FileAssetLoader> loaders;

    public /* synthetic */ FallbackAssetLoader(Context context, boolean z10, FileAssetLoader fileAssetLoader, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i10 & 2) != 0 ? true : z10, (i10 & 4) != 0 ? null : fileAssetLoader);
    }

    @l1(otherwise = 3)
    public static /* synthetic */ void getLoaders$annotations() {
    }

    private final void resetCDNLoader(boolean z10, Context context) {
        Iterator<FileAssetLoader> it = this.loaders.iterator();
        int i10 = 0;
        while (true) {
            if (!it.hasNext()) {
                i10 = -1;
                break;
            } else if (it.next() instanceof CDNAssetLoader) {
                break;
            } else {
                i10++;
            }
        }
        if (i10 == -1 && z10) {
            Context applicationContext = context.getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
            appendLoader(new CDNAssetLoader(applicationContext));
        } else {
            if (i10 >= 0 && !z10) {
                FileAssetLoader fileAssetLoaderRemove = this.loaders.remove(i10);
                getDependencies().remove(fileAssetLoaderRemove);
                fileAssetLoaderRemove.release();
            }
        }
    }

    public final void appendLoader(@NotNull FileAssetLoader loader) {
        Intrinsics.checkNotNullParameter(loader, "loader");
        this.loaders.add(loader);
        getDependencies().add(loader);
    }

    @NotNull
    public final List<FileAssetLoader> getLoaders() {
        return this.loaders;
    }

    @Override // app.rive.runtime.kotlin.core.FileAssetLoader
    public boolean loadContents(@NotNull FileAsset asset, @NotNull byte[] inBandBytes) {
        Intrinsics.checkNotNullParameter(asset, "asset");
        Intrinsics.checkNotNullParameter(inBandBytes, "inBandBytes");
        List<FileAssetLoader> list = this.loaders;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (((FileAssetLoader) it.next()).loadContents(asset, inBandBytes)) {
                return true;
            }
        }
        return false;
    }

    public final void prependLoader(@NotNull FileAssetLoader loader) {
        Intrinsics.checkNotNullParameter(loader, "loader");
        this.loaders.add(0, loader);
        getDependencies().add(loader);
    }

    public final void resetWith$kotlin_release(@NotNull RiveAnimationView.Builder builder) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        FileAssetLoader assetLoader$kotlin_release = builder.getAssetLoader$kotlin_release();
        if (assetLoader$kotlin_release != null) {
            prependLoader(assetLoader$kotlin_release);
        }
        boolean shouldLoadCDNAssets$kotlin_release = builder.getShouldLoadCDNAssets$kotlin_release();
        Context applicationContext = builder.getContext$kotlin_release().getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        resetCDNLoader(shouldLoadCDNAssets$kotlin_release, applicationContext);
    }

    public FallbackAssetLoader(@NotNull Context context, boolean z10, @Nullable FileAssetLoader fileAssetLoader) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.loaders = new ArrayList();
        if (fileAssetLoader != null) {
            appendLoader(fileAssetLoader);
        }
        if (z10) {
            Context applicationContext = context.getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
            appendLoader(new CDNAssetLoader(applicationContext));
        }
    }
}
