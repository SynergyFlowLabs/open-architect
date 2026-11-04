package androidx.compose.foundation.text.input.internal;

import android.os.LocaleList;
import android.view.inputmethod.EditorInfo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 1)
@androidx.annotation.w0(24)
@SourceDebugExtension({"SMAP\nEditorInfo.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EditorInfo.android.kt\nandroidx/compose/foundation/text/input/internal/LocaleListHelper\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,195:1\n1557#2:196\n1628#2,3:197\n37#3,2:200\n*S KotlinDebug\n*F\n+ 1 EditorInfo.android.kt\nandroidx/compose/foundation/text/input/internal/LocaleListHelper\n*L\n167#1:196\n167#1:197,3\n167#1:200,2\n*E\n"})
public final class d4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final d4 f19534a = new d4();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f19535b = 0;

    private d4() {
    }

    @androidx.annotation.w0(24)
    public final void a(@NotNull EditorInfo editorInfo, @NotNull y0.f fVar) {
        if (Intrinsics.areEqual(fVar, y0.f.f390674c.b())) {
            editorInfo.hintLocales = null;
            return;
        }
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(fVar, 10));
        Iterator<y0.e> it = fVar.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().b());
        }
        Locale[] localeArr = (Locale[]) arrayList.toArray(new Locale[0]);
        editorInfo.hintLocales = new LocaleList((Locale[]) Arrays.copyOf(localeArr, localeArr.length));
    }
}
