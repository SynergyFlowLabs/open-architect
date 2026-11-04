package td;

import android.content.Context;
import android.graphics.Bitmap;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.i1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@SourceDebugExtension({"SMAP\nImageBlur.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ImageBlur.kt\ncom/planner5d/library/services/image/ImageBlur\n+ 2 Bitmap.kt\nandroidx/core/graphics/BitmapKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,51:1\n72#2:52\n1#3:53\n*S KotlinDebug\n*F\n+ 1 ImageBlur.kt\ncom/planner5d/library/services/image/ImageBlur\n*L\n19#1:52\n*E\n"})
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final b f380853a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private static final Object f380854b = new Object();

    private b() {
    }

    private final void b(Context context, Bitmap bitmap, float f10, int i10) {
        Bitmap bitmapCopy = bitmap.copy(a.f380845a.i(bitmap.getConfig()), false);
        RenderScript renderScriptCreate = RenderScript.create(context);
        ScriptIntrinsicBlur scriptIntrinsicBlurCreate = ScriptIntrinsicBlur.create(renderScriptCreate, Element.U8_4(renderScriptCreate));
        Allocation allocationCreateFromBitmap = Allocation.createFromBitmap(renderScriptCreate, bitmap);
        Allocation allocationCreateFromBitmap2 = Allocation.createFromBitmap(renderScriptCreate, bitmapCopy);
        scriptIntrinsicBlurCreate.setRadius(f10);
        scriptIntrinsicBlurCreate.setInput(allocationCreateFromBitmap);
        for (int i11 = 0; i11 < i10; i11++) {
            scriptIntrinsicBlurCreate.forEach(allocationCreateFromBitmap2);
        }
        allocationCreateFromBitmap2.copyTo(bitmap);
        allocationCreateFromBitmap.destroy();
        allocationCreateFromBitmap2.destroy();
        bitmapCopy.recycle();
        scriptIntrinsicBlurCreate.destroy();
        renderScriptCreate.destroy();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v11, types: [T, android.graphics.Bitmap] */
    /* JADX WARN: Type inference failed for: r9v4, types: [T, android.graphics.Bitmap] */
    @Nullable
    public final Bitmap a(@NotNull Context context, float f10, int i10, @NotNull Bitmap image, @Nullable Integer num, @Nullable Integer num2) {
        Bitmap bitmap;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(image, "image");
        synchronized (f380854b) {
            try {
                i1.h hVar = new i1.h();
                try {
                    ?? CreateScaledBitmap = Bitmap.createScaledBitmap(image, num != null ? num.intValue() : image.getWidth(), num2 != null ? num2.intValue() : image.getHeight(), true);
                    hVar.f312751a = CreateScaledBitmap;
                    if (f10 > 0.0f && i10 > 0) {
                        if (!CreateScaledBitmap.isMutable()) {
                            T t10 = hVar.f312751a;
                            ?? Copy = ((Bitmap) t10).copy(a.f380845a.i(((Bitmap) t10).getConfig()), true);
                            ((Bitmap) hVar.f312751a).recycle();
                            hVar.f312751a = Copy;
                        }
                        f380853a.b(context, (Bitmap) hVar.f312751a, f10, i10);
                    }
                    bitmap = (Bitmap) hVar.f312751a;
                } catch (OutOfMemoryError unused) {
                    if (num != null || num2 != null) {
                        image = null;
                    }
                    return image;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return bitmap;
    }
}
