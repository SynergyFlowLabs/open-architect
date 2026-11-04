package z0;

import android.os.LocaleList;
import android.text.style.LocaleSpan;
import androidx.compose.runtime.internal.w0;
import androidx.compose.ui.text.platform.o;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@w0(parameters = 1)
@androidx.annotation.w0(24)
@SourceDebugExtension({"SMAP\nLocaleExtensions.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LocaleExtensions.android.kt\nandroidx/compose/ui/text/platform/extensions/LocaleListHelperMethods\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,41:1\n1557#2:42\n1628#2,3:43\n1557#2:48\n1628#2,3:49\n37#3,2:46\n37#3,2:52\n*S KotlinDebug\n*F\n+ 1 LocaleExtensions.android.kt\nandroidx/compose/ui/text/platform/extensions/LocaleListHelperMethods\n*L\n33#1:42\n33#1:43,3\n38#1:48\n38#1:49,3\n33#1:46,2\n38#1:52,2\n*E\n"})
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f399846a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f399847b = 0;

    private a() {
    }

    @androidx.annotation.w0(24)
    @NotNull
    public final Object a(@NotNull y0.f fVar) {
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(fVar, 10));
        Iterator<y0.e> it = fVar.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().b());
        }
        Locale[] localeArr = (Locale[]) arrayList.toArray(new Locale[0]);
        return new LocaleSpan(new LocaleList((Locale[]) Arrays.copyOf(localeArr, localeArr.length)));
    }

    @androidx.annotation.w0(24)
    public final void b(@NotNull o oVar, @NotNull y0.f fVar) {
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(fVar, 10));
        Iterator<y0.e> it = fVar.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().b());
        }
        Locale[] localeArr = (Locale[]) arrayList.toArray(new Locale[0]);
        oVar.setTextLocales(new LocaleList((Locale[]) Arrays.copyOf(localeArr, localeArr.length)));
    }
}
