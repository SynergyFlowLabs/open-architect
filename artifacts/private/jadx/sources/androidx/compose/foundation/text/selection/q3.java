package androidx.compose.foundation.text.selection;

import android.content.Context;
import android.os.LocaleList;
import android.text.TextUtils;
import android.view.textclassifier.TextClassification;
import android.view.textclassifier.TextClassificationContext;
import android.view.textclassifier.TextClassificationManager;
import android.view.textclassifier.TextClassifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 1)
@androidx.annotation.w0(28)
@SourceDebugExtension({"SMAP\nPlatformSelectionBehaviors.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PlatformSelectionBehaviors.android.kt\nandroidx/compose/foundation/text/selection/TextClassifierHelperMethods\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,346:1\n1557#2:347\n1628#2,3:348\n37#3,2:351\n*S KotlinDebug\n*F\n+ 1 PlatformSelectionBehaviors.android.kt\nandroidx/compose/foundation/text/selection/TextClassifierHelperMethods\n*L\n335#1:347\n335#1:348,3\n335#1:351,2\n*E\n"})
public final class q3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final q3 f21346a = new q3();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f21347b = 0;

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f21348a;

        static {
            int[] iArr = new int[g0.values().length];
            try {
                iArr[g0.EditableText.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[g0.StaticText.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f21348a = iArr;
        }
    }

    private q3() {
    }

    @NotNull
    public final TextClassifier a(@NotNull Context context, @NotNull g0 g0Var) {
        String str;
        TextClassificationManager textClassificationManager = (TextClassificationManager) context.getSystemService(TextClassificationManager.class);
        int i10 = a.f21348a[g0Var.ordinal()];
        if (i10 != 1) {
            int i11 = 7 << 2;
            if (i10 != 2) {
                throw new kotlin.k0();
            }
            str = "textview";
        } else {
            str = "edittext";
        }
        return textClassificationManager.createTextClassificationSession(new TextClassificationContext.Builder(context.getPackageName(), str).build());
    }

    public final boolean b(@NotNull TextClassification textClassification) {
        if (textClassification.getIcon() == null && TextUtils.isEmpty(textClassification.getLabel())) {
            return false;
        }
        return (textClassification.getIntent() == null && textClassification.getOnClickListener() == null) ? false : true;
    }

    @NotNull
    public final LocaleList c(@NotNull y0.f fVar) {
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(fVar, 10));
        Iterator<y0.e> it = fVar.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().b());
        }
        Locale[] localeArr = (Locale[]) arrayList.toArray(new Locale[0]);
        return new LocaleList((Locale[]) Arrays.copyOf(localeArr, localeArr.length));
    }
}
