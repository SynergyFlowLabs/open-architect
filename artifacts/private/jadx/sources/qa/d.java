package qa;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import androidx.annotation.m1;
import androidx.compose.runtime.internal.w0;
import com.planner5d.library.activity.helper.imagechooser.m;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@w0(parameters = 0)
@SourceDebugExtension({"SMAP\nCombinedImageRequestStrategy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CombinedImageRequestStrategy.kt\ncom/planner5d/library/activity/helper/imagechooser/strategy/CombinedImageRequestStrategy\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 4 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,25:1\n1#2:26\n13409#3,2:27\n12574#3,2:31\n37#4,2:29\n*S KotlinDebug\n*F\n+ 1 CombinedImageRequestStrategy.kt\ncom/planner5d/library/activity/helper/imagechooser/strategy/CombinedImageRequestStrategy\n*L\n11#1:27,2\n13#1:31,2\n11#1:29,2\n*E\n"})
public final class d implements e {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f350293d = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final e[] f350294a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final String[] f350295b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f350296c;

    public d(@NotNull e... strategies) {
        Intrinsics.checkNotNullParameter(strategies, "strategies");
        this.f350294a = strategies;
        List listCreateListBuilder = CollectionsKt.createListBuilder();
        boolean z10 = false;
        for (e eVar : strategies) {
            CollectionsKt.addAll(listCreateListBuilder, eVar.c());
        }
        this.f350295b = (String[]) CollectionsKt.build(listCreateListBuilder).toArray(new String[0]);
        for (e eVar2 : this.f350294a) {
            if (eVar2.a()) {
                z10 = true;
                break;
            }
        }
        this.f350296c = z10;
    }

    @Override // qa.e
    public boolean a() {
        return this.f350296c;
    }

    @Override // qa.e
    @m1
    @Nullable
    public Bitmap b(@NotNull Context context, @NotNull Uri input, @NotNull m options) throws Exception {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(options, "options");
        int i10 = 6 >> 0;
        for (e eVar : this.f350294a) {
            Bitmap bitmapB = eVar.b(context, input, options);
            if (bitmapB != null) {
                return bitmapB;
            }
        }
        return null;
    }

    @Override // qa.e
    @NotNull
    public String[] c() {
        return this.f350295b;
    }
}
