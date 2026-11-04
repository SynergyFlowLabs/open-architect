package g;

import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.ext.SdkExtensions;
import android.provider.MediaStore;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.IntentSenderRequest;
import androidx.annotation.w0;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.b1;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.k0;
import kotlin.ranges.r;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    public static class a extends g.a<Uri, Boolean> {
        @Override // g.a
        @androidx.annotation.i
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Intent createIntent(@NotNull Context context, @NotNull Uri input) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(input, "input");
            Intent intentPutExtra = new Intent("android.media.action.VIDEO_CAPTURE").putExtra("output", input);
            Intrinsics.checkNotNullExpressionValue(intentPutExtra, "Intent(MediaStore.ACTION…tore.EXTRA_OUTPUT, input)");
            return intentPutExtra;
        }

        @Override // g.a
        @Nullable
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final g.a.C1904a<Boolean> getSynchronousResult(@NotNull Context context, @NotNull Uri input) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(input, "input");
            return null;
        }

        @Override // g.a
        @NotNull
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Boolean parseResult(int i10, @Nullable Intent intent) {
            return Boolean.valueOf(i10 == -1);
        }
    }

    /* JADX INFO: renamed from: g.b$b, reason: collision with other inner class name */
    @SourceDebugExtension({"SMAP\nActivityResultContracts.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActivityResultContracts.kt\nandroidx/activity/result/contract/ActivityResultContracts$CreateDocument\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,962:1\n1#2:963\n*E\n"})
    public static class C1905b extends g.a<String, Uri> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final String f275323a;

        public C1905b(@NotNull String mimeType) {
            Intrinsics.checkNotNullParameter(mimeType, "mimeType");
            this.f275323a = mimeType;
        }

        @Override // g.a
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final g.a.C1904a<Uri> getSynchronousResult(@NotNull Context context, @NotNull String input) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(input, "input");
            return null;
        }

        @Override // g.a
        @Nullable
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Uri parseResult(int i10, @Nullable Intent intent) {
            if (i10 != -1) {
                intent = null;
            }
            if (intent != null) {
                return intent.getData();
            }
            return null;
        }

        @Override // g.a
        @androidx.annotation.i
        @NotNull
        public Intent createIntent(@NotNull Context context, @NotNull String input) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(input, "input");
            Intent intentPutExtra = new Intent("android.intent.action.CREATE_DOCUMENT").setType(this.f275323a).putExtra("android.intent.extra.TITLE", input);
            Intrinsics.checkNotNullExpressionValue(intentPutExtra, "Intent(Intent.ACTION_CRE…ntent.EXTRA_TITLE, input)");
            return intentPutExtra;
        }

        @kotlin.l(message = "Using a wildcard mime type with CreateDocument is not recommended as it breaks the automatic handling of file extensions. Instead, specify the mime type by using the constructor that takes an concrete mime type (e.g.., CreateDocument(\"image/png\")).", replaceWith = @b1(expression = "CreateDocument(\"todo/todo\")", imports = {}))
        public C1905b() {
            this("*/*");
        }
    }

    @SourceDebugExtension({"SMAP\nActivityResultContracts.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActivityResultContracts.kt\nandroidx/activity/result/contract/ActivityResultContracts$GetContent\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,962:1\n1#2:963\n*E\n"})
    public static class c extends g.a<String, Uri> {
        @Override // g.a
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final g.a.C1904a<Uri> getSynchronousResult(@NotNull Context context, @NotNull String input) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(input, "input");
            return null;
        }

        @Override // g.a
        @Nullable
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Uri parseResult(int i10, @Nullable Intent intent) {
            if (i10 != -1) {
                intent = null;
            }
            if (intent != null) {
                return intent.getData();
            }
            return null;
        }

        @Override // g.a
        @androidx.annotation.i
        @NotNull
        public Intent createIntent(@NotNull Context context, @NotNull String input) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(input, "input");
            Intent type = new Intent("android.intent.action.GET_CONTENT").addCategory("android.intent.category.OPENABLE").setType(input);
            Intrinsics.checkNotNullExpressionValue(type, "Intent(Intent.ACTION_GET…          .setType(input)");
            return type;
        }
    }

    @SourceDebugExtension({"SMAP\nActivityResultContracts.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActivityResultContracts.kt\nandroidx/activity/result/contract/ActivityResultContracts$GetMultipleContents\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,962:1\n1#2:963\n*E\n"})
    public static class d extends g.a<String, List<Uri>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final a f275324a = new a(null);

        @SourceDebugExtension({"SMAP\nActivityResultContracts.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActivityResultContracts.kt\nandroidx/activity/result/contract/ActivityResultContracts$GetMultipleContents$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,962:1\n1#2:963\n*E\n"})
        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            public final List<Uri> a(@NotNull Intent intent) {
                Intrinsics.checkNotNullParameter(intent, "<this>");
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                Uri data = intent.getData();
                if (data != null) {
                    linkedHashSet.add(data);
                }
                ClipData clipData = intent.getClipData();
                if (clipData == null && linkedHashSet.isEmpty()) {
                    return CollectionsKt.emptyList();
                }
                if (clipData != null) {
                    int itemCount = clipData.getItemCount();
                    for (int i10 = 0; i10 < itemCount; i10++) {
                        Uri uri = clipData.getItemAt(i10).getUri();
                        if (uri != null) {
                            linkedHashSet.add(uri);
                        }
                    }
                }
                return new ArrayList(linkedHashSet);
            }

            private a() {
            }
        }

        @Override // g.a
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final g.a.C1904a<List<Uri>> getSynchronousResult(@NotNull Context context, @NotNull String input) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(input, "input");
            return null;
        }

        @Override // g.a
        @androidx.annotation.i
        @NotNull
        public Intent createIntent(@NotNull Context context, @NotNull String input) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(input, "input");
            int i10 = 6 >> 1;
            Intent intentPutExtra = new Intent("android.intent.action.GET_CONTENT").addCategory("android.intent.category.OPENABLE").setType(input).putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
            Intrinsics.checkNotNullExpressionValue(intentPutExtra, "Intent(Intent.ACTION_GET…TRA_ALLOW_MULTIPLE, true)");
            return intentPutExtra;
        }

        @Override // g.a
        @NotNull
        public final List<Uri> parseResult(int i10, @Nullable Intent intent) {
            List<Uri> listA;
            if (i10 != -1) {
                intent = null;
            }
            if (intent != null && (listA = f275324a.a(intent)) != null) {
                return listA;
            }
            return CollectionsKt.emptyList();
        }
    }

    @SourceDebugExtension({"SMAP\nActivityResultContracts.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActivityResultContracts.kt\nandroidx/activity/result/contract/ActivityResultContracts$OpenDocument\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,962:1\n1#2:963\n*E\n"})
    public static class e extends g.a<String[], Uri> {
        @Override // g.a
        @androidx.annotation.i
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Intent createIntent(@NotNull Context context, @NotNull String[] input) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(input, "input");
            Intent type = new Intent("android.intent.action.OPEN_DOCUMENT").putExtra("android.intent.extra.MIME_TYPES", input).setType("*/*");
            Intrinsics.checkNotNullExpressionValue(type, "Intent(Intent.ACTION_OPE…          .setType(\"*/*\")");
            return type;
        }

        @Override // g.a
        @Nullable
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final g.a.C1904a<Uri> getSynchronousResult(@NotNull Context context, @NotNull String[] input) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(input, "input");
            return null;
        }

        @Override // g.a
        @Nullable
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Uri parseResult(int i10, @Nullable Intent intent) {
            if (i10 != -1) {
                intent = null;
            }
            if (intent != null) {
                return intent.getData();
            }
            return null;
        }
    }

    @w0(21)
    @SourceDebugExtension({"SMAP\nActivityResultContracts.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActivityResultContracts.kt\nandroidx/activity/result/contract/ActivityResultContracts$OpenDocumentTree\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,962:1\n1#2:963\n*E\n"})
    public static class f extends g.a<Uri, Uri> {
        @Override // g.a
        @androidx.annotation.i
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Intent createIntent(@NotNull Context context, @Nullable Uri uri) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intent intent = new Intent("android.intent.action.OPEN_DOCUMENT_TREE");
            if (uri != null) {
                intent.putExtra("android.provider.extra.INITIAL_URI", uri);
            }
            return intent;
        }

        @Override // g.a
        @Nullable
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final g.a.C1904a<Uri> getSynchronousResult(@NotNull Context context, @Nullable Uri uri) {
            Intrinsics.checkNotNullParameter(context, "context");
            return null;
        }

        @Override // g.a
        @Nullable
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Uri parseResult(int i10, @Nullable Intent intent) {
            if (i10 != -1) {
                intent = null;
            }
            if (intent != null) {
                return intent.getData();
            }
            return null;
        }
    }

    @SourceDebugExtension({"SMAP\nActivityResultContracts.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActivityResultContracts.kt\nandroidx/activity/result/contract/ActivityResultContracts$OpenMultipleDocuments\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,962:1\n1#2:963\n*E\n"})
    public static class g extends g.a<String[], List<Uri>> {
        @Override // g.a
        @androidx.annotation.i
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Intent createIntent(@NotNull Context context, @NotNull String[] input) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(input, "input");
            Intent type = new Intent("android.intent.action.OPEN_DOCUMENT").putExtra("android.intent.extra.MIME_TYPES", input).putExtra("android.intent.extra.ALLOW_MULTIPLE", true).setType("*/*");
            Intrinsics.checkNotNullExpressionValue(type, "Intent(Intent.ACTION_OPE…          .setType(\"*/*\")");
            return type;
        }

        @Override // g.a
        @Nullable
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final g.a.C1904a<List<Uri>> getSynchronousResult(@NotNull Context context, @NotNull String[] input) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(input, "input");
            return null;
        }

        @Override // g.a
        @NotNull
        public final List<Uri> parseResult(int i10, @Nullable Intent intent) {
            List<Uri> listA;
            if (i10 != -1) {
                intent = null;
            }
            return (intent == null || (listA = d.f275324a.a(intent)) == null) ? CollectionsKt.emptyList() : listA;
        }
    }

    @SourceDebugExtension({"SMAP\nActivityResultContracts.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActivityResultContracts.kt\nandroidx/activity/result/contract/ActivityResultContracts$PickContact\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,962:1\n1#2:963\n*E\n"})
    public static final class h extends g.a<Void, Uri> {
        @Override // g.a
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Intent createIntent(@NotNull Context context, @Nullable Void r10) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intent type = new Intent("android.intent.action.PICK").setType("vnd.android.cursor.dir/contact");
            Intrinsics.checkNotNullExpressionValue(type, "Intent(Intent.ACTION_PIC…ct.Contacts.CONTENT_TYPE)");
            return type;
        }

        @Override // g.a
        @Nullable
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Uri parseResult(int i10, @Nullable Intent intent) {
            if (i10 != -1) {
                intent = null;
            }
            if (intent != null) {
                return intent.getData();
            }
            return null;
        }
    }

    @SourceDebugExtension({"SMAP\nActivityResultContracts.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActivityResultContracts.kt\nandroidx/activity/result/contract/ActivityResultContracts$PickMultipleVisualMedia\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,962:1\n1#2:963\n*E\n"})
    public static class i extends g.a<androidx.activity.result.m, List<Uri>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final a f275325b = new a(null);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f275326a;

        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @e.a({"NewApi", "ClassVerificationFailure"})
            public final int a() {
                if (j.f275327a.k()) {
                    return MediaStore.getPickImagesMaxLimit();
                }
                return Integer.MAX_VALUE;
            }

            private a() {
            }
        }

        public i() {
            this(0, 1, null);
        }

        @Override // g.a
        @androidx.annotation.i
        @e.a({"NewApi", "ClassVerificationFailure"})
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Intent createIntent(@NotNull Context context, @NotNull androidx.activity.result.m input) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(input, "input");
            j.a aVar = j.f275327a;
            if (aVar.k()) {
                Intent intent = new Intent("android.provider.action.PICK_IMAGES");
                intent.setType(aVar.g(input.d()));
                int iMin = Math.min(this.f275326a, input.c());
                if (iMin <= 1 || iMin > MediaStore.getPickImagesMaxLimit()) {
                    throw new IllegalArgumentException("Max items must be greater than 1 and lesser than or equal to MediaStore.getPickImagesMaxLimit()");
                }
                intent.putExtra("android.provider.extra.PICK_IMAGES_MAX", iMin);
                intent.putExtra("android.provider.extra.PICK_IMAGES_LAUNCH_TAB", input.b().a());
                intent.putExtra("android.provider.extra.PICK_IMAGES_IN_ORDER", input.f());
                if (input.e()) {
                    intent.putExtra("android.provider.extra.PICK_IMAGES_ACCENT_COLOR", input.a());
                }
                return intent;
            }
            if (!aVar.j(context)) {
                Intent intent2 = new Intent("android.intent.action.OPEN_DOCUMENT");
                intent2.setType(aVar.g(input.d()));
                intent2.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
                if (intent2.getType() == null) {
                    intent2.setType("*/*");
                    intent2.putExtra("android.intent.extra.MIME_TYPES", new String[]{"image/*", "video/*"});
                }
                return intent2;
            }
            ResolveInfo resolveInfoF = aVar.f(context);
            if (resolveInfoF == null) {
                throw new IllegalStateException("Required value was null.");
            }
            ActivityInfo activityInfo = resolveInfoF.activityInfo;
            Intent intent3 = new Intent(j.f275328b);
            intent3.setClassName(activityInfo.applicationInfo.packageName, activityInfo.name);
            intent3.setType(aVar.g(input.d()));
            int iMin2 = Math.min(this.f275326a, input.c());
            if (iMin2 <= 1) {
                throw new IllegalArgumentException("Max items must be greater than 1");
            }
            intent3.putExtra(j.f275331e, iMin2);
            intent3.putExtra(j.f275332f, input.b().a());
            intent3.putExtra(j.f275333g, input.f());
            if (input.e()) {
                intent3.putExtra(j.f275334h, input.a());
            }
            return intent3;
        }

        @Override // g.a
        @Nullable
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final g.a.C1904a<List<Uri>> getSynchronousResult(@NotNull Context context, @NotNull androidx.activity.result.m input) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(input, "input");
            return null;
        }

        public /* synthetic */ i(int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? f275325b.a() : i10);
        }

        @Override // g.a
        @NotNull
        public final List<Uri> parseResult(int i10, @Nullable Intent intent) {
            List<Uri> listA;
            if (i10 != -1) {
                intent = null;
            }
            return (intent == null || (listA = d.f275324a.a(intent)) == null) ? CollectionsKt.emptyList() : listA;
        }

        public i(int i10) {
            this.f275326a = i10;
            if (i10 <= 1) {
                throw new IllegalArgumentException("Max items must be higher than 1");
            }
        }
    }

    @SourceDebugExtension({"SMAP\nActivityResultContracts.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActivityResultContracts.kt\nandroidx/activity/result/contract/ActivityResultContracts$PickVisualMedia\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,962:1\n1#2:963\n*E\n"})
    public static class j extends g.a<androidx.activity.result.m, Uri> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final a f275327a = new a(null);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final String f275328b = "androidx.activity.result.contract.action.PICK_IMAGES";

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public static final String f275329c = "com.google.android.gms.provider.action.PICK_IMAGES";

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public static final String f275330d = "com.google.android.gms.provider.extra.PICK_IMAGES_MAX";

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @NotNull
        public static final String f275331e = "androidx.activity.result.contract.extra.PICK_IMAGES_MAX";

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @NotNull
        public static final String f275332f = "androidx.activity.result.contract.extra.PICK_IMAGES_LAUNCH_TAB";

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @NotNull
        public static final String f275333g = "androidx.activity.result.contract.extra.PICK_IMAGES_IN_ORDER";

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        @NotNull
        public static final String f275334h = "androidx.activity.result.contract.extra.PICK_IMAGES_ACCENT_COLOR";

        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public static /* synthetic */ void a() {
            }

            public static /* synthetic */ void b() {
            }

            public static /* synthetic */ void c() {
            }

            public static /* synthetic */ void d() {
            }

            public static /* synthetic */ void e() {
            }

            @oj.n
            @Nullable
            public final ResolveInfo f(@NotNull Context context) {
                Intrinsics.checkNotNullParameter(context, "context");
                return context.getPackageManager().resolveActivity(new Intent(j.f275328b), 1114112);
            }

            @Nullable
            public final String g(@NotNull g input) {
                Intrinsics.checkNotNullParameter(input, "input");
                if (input instanceof d) {
                    return "image/*";
                }
                if (input instanceof f) {
                    return "video/*";
                }
                if (input instanceof e) {
                    return ((e) input).a();
                }
                if (input instanceof c) {
                    return null;
                }
                throw new k0();
            }

            @oj.n
            @e.a({"ClassVerificationFailure", "NewApi"})
            @kotlin.l(message = "This method is deprecated in favor of isPhotoPickerAvailable(context) to support the picker provided by updatable system apps", replaceWith = @b1(expression = "isPhotoPickerAvailable(context)", imports = {}))
            public final boolean h() {
                return k();
            }

            @oj.n
            @e.a({"ClassVerificationFailure", "NewApi"})
            public final boolean i(@NotNull Context context) {
                Intrinsics.checkNotNullParameter(context, "context");
                if (!k() && !j(context)) {
                    return false;
                }
                return true;
            }

            @oj.n
            public final boolean j(@NotNull Context context) {
                Intrinsics.checkNotNullParameter(context, "context");
                return f(context) != null;
            }

            @oj.n
            @e.a({"ClassVerificationFailure", "NewApi"})
            public final boolean k() {
                int i10 = Build.VERSION.SDK_INT;
                if (i10 >= 33) {
                    return true;
                }
                return i10 >= 30 && SdkExtensions.getExtensionVersion(30) >= 2;
            }

            private a() {
            }
        }

        /* JADX INFO: renamed from: g.b$j$b, reason: collision with other inner class name */
        public static abstract class AbstractC1906b {

            /* JADX INFO: renamed from: g.b$j$b$a */
            public static final class a extends AbstractC1906b {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                @NotNull
                public static final a f275335a = new a();

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                private static final int f275336b = 0;

                private a() {
                    super(null);
                }

                @Override // g.b.j.AbstractC1906b
                public int a() {
                    return f275336b;
                }
            }

            /* JADX INFO: renamed from: g.b$j$b$b, reason: collision with other inner class name */
            public static final class C1907b extends AbstractC1906b {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                @NotNull
                public static final C1907b f275337a = new C1907b();

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                private static final int f275338b = 1;

                private C1907b() {
                    super(null);
                }

                @Override // g.b.j.AbstractC1906b
                public int a() {
                    return f275338b;
                }
            }

            public /* synthetic */ AbstractC1906b(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public abstract int a();

            private AbstractC1906b() {
            }
        }

        public static final class c implements g {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public static final c f275339a = new c();

            private c() {
            }
        }

        public static final class d implements g {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public static final d f275340a = new d();

            private d() {
            }
        }

        public static final class e implements g {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            private final String f275341a;

            public e(@NotNull String mimeType) {
                Intrinsics.checkNotNullParameter(mimeType, "mimeType");
                this.f275341a = mimeType;
            }

            @NotNull
            public final String a() {
                return this.f275341a;
            }
        }

        public static final class f implements g {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public static final f f275342a = new f();

            private f() {
            }
        }

        public interface g {
        }

        @oj.n
        @Nullable
        public static final ResolveInfo c(@NotNull Context context) {
            return f275327a.f(context);
        }

        @oj.n
        @e.a({"ClassVerificationFailure", "NewApi"})
        @kotlin.l(message = "This method is deprecated in favor of isPhotoPickerAvailable(context) to support the picker provided by updatable system apps", replaceWith = @b1(expression = "isPhotoPickerAvailable(context)", imports = {}))
        public static final boolean d() {
            return f275327a.h();
        }

        @oj.n
        @e.a({"ClassVerificationFailure", "NewApi"})
        public static final boolean e(@NotNull Context context) {
            return f275327a.i(context);
        }

        @oj.n
        public static final boolean f(@NotNull Context context) {
            return f275327a.j(context);
        }

        @oj.n
        @e.a({"ClassVerificationFailure", "NewApi"})
        public static final boolean g() {
            return f275327a.k();
        }

        @Override // g.a
        @androidx.annotation.i
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Intent createIntent(@NotNull Context context, @NotNull androidx.activity.result.m input) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(input, "input");
            a aVar = f275327a;
            if (aVar.k()) {
                Intent intent = new Intent("android.provider.action.PICK_IMAGES");
                intent.setType(aVar.g(input.d()));
                intent.putExtra("android.provider.extra.PICK_IMAGES_LAUNCH_TAB", input.b().a());
                if (input.e()) {
                    intent.putExtra("android.provider.extra.PICK_IMAGES_ACCENT_COLOR", input.a());
                }
                return intent;
            }
            if (!aVar.j(context)) {
                Intent intent2 = new Intent("android.intent.action.OPEN_DOCUMENT");
                intent2.setType(aVar.g(input.d()));
                if (intent2.getType() == null) {
                    intent2.setType("*/*");
                    intent2.putExtra("android.intent.extra.MIME_TYPES", new String[]{"image/*", "video/*"});
                }
                return intent2;
            }
            ResolveInfo resolveInfoF = aVar.f(context);
            if (resolveInfoF == null) {
                throw new IllegalStateException("Required value was null.");
            }
            ActivityInfo activityInfo = resolveInfoF.activityInfo;
            Intent intent3 = new Intent(f275328b);
            intent3.setClassName(activityInfo.applicationInfo.packageName, activityInfo.name);
            intent3.setType(aVar.g(input.d()));
            intent3.putExtra(f275332f, input.b().a());
            if (input.e()) {
                intent3.putExtra(f275334h, input.a());
            }
            return intent3;
        }

        @Override // g.a
        @Nullable
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final g.a.C1904a<Uri> getSynchronousResult(@NotNull Context context, @NotNull androidx.activity.result.m input) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(input, "input");
            return null;
        }

        @Override // g.a
        @Nullable
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public final Uri parseResult(int i10, @Nullable Intent intent) {
            if (i10 != -1) {
                intent = null;
            }
            if (intent == null) {
                return null;
            }
            Uri data = intent.getData();
            if (data == null) {
                data = (Uri) CollectionsKt.firstOrNull((List) d.f275324a.a(intent));
            }
            return data;
        }
    }

    @SourceDebugExtension({"SMAP\nActivityResultContracts.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActivityResultContracts.kt\nandroidx/activity/result/contract/ActivityResultContracts$RequestMultiplePermissions\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,962:1\n12541#2,2:963\n8676#2,2:965\n9358#2,4:967\n11365#2:971\n11700#2,3:972\n*S KotlinDebug\n*F\n+ 1 ActivityResultContracts.kt\nandroidx/activity/result/contract/ActivityResultContracts$RequestMultiplePermissions\n*L\n180#1:963,2\n185#1:965,2\n185#1:967,4\n196#1:971\n196#1:972,3\n*E\n"})
    public static final class k extends g.a<String[], Map<String, Boolean>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final a f275343a = new a(null);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final String f275344b = "androidx.activity.result.contract.action.REQUEST_PERMISSIONS";

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public static final String f275345c = "androidx.activity.result.contract.extra.PERMISSIONS";

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public static final String f275346d = "androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS";

        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            public final Intent a(@NotNull String[] input) {
                Intrinsics.checkNotNullParameter(input, "input");
                Intent intentPutExtra = new Intent(k.f275344b).putExtra(k.f275345c, input);
                Intrinsics.checkNotNullExpressionValue(intentPutExtra, "Intent(ACTION_REQUEST_PE…EXTRA_PERMISSIONS, input)");
                return intentPutExtra;
            }

            private a() {
            }
        }

        @Override // g.a
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Intent createIntent(@NotNull Context context, @NotNull String[] input) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(input, "input");
            return f275343a.a(input);
        }

        @Override // g.a
        @Nullable
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public g.a.C1904a<Map<String, Boolean>> getSynchronousResult(@NotNull Context context, @NotNull String[] input) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(input, "input");
            if (input.length == 0) {
                return new g.a.C1904a<>(MapsKt.emptyMap());
            }
            for (String str : input) {
                if (androidx.core.content.d.a(context, str) != 0) {
                    return null;
                }
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(r.u(MapsKt.mapCapacity(input.length), 16));
            for (String str2 : input) {
                Pair pair = TuplesKt.to(str2, Boolean.TRUE);
                linkedHashMap.put(pair.getFirst(), pair.getSecond());
            }
            return new g.a.C1904a<>(linkedHashMap);
        }

        @Override // g.a
        @NotNull
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public Map<String, Boolean> parseResult(int i10, @Nullable Intent intent) {
            if (i10 == -1 && intent != null) {
                String[] stringArrayExtra = intent.getStringArrayExtra(f275345c);
                int[] intArrayExtra = intent.getIntArrayExtra(f275346d);
                if (intArrayExtra != null && stringArrayExtra != null) {
                    ArrayList arrayList = new ArrayList(intArrayExtra.length);
                    for (int i11 : intArrayExtra) {
                        arrayList.add(Boolean.valueOf(i11 == 0));
                    }
                    return MapsKt.toMap(CollectionsKt.zip(ArraysKt.filterNotNull(stringArrayExtra), arrayList));
                }
                return MapsKt.emptyMap();
            }
            return MapsKt.emptyMap();
        }
    }

    @SourceDebugExtension({"SMAP\nActivityResultContracts.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActivityResultContracts.kt\nandroidx/activity/result/contract/ActivityResultContracts$RequestPermission\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,962:1\n12774#2,2:963\n*S KotlinDebug\n*F\n+ 1 ActivityResultContracts.kt\nandroidx/activity/result/contract/ActivityResultContracts$RequestPermission\n*L\n212#1:963,2\n*E\n"})
    public static final class l extends g.a<String, Boolean> {
        @Override // g.a
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public g.a.C1904a<Boolean> getSynchronousResult(@NotNull Context context, @NotNull String input) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(input, "input");
            if (androidx.core.content.d.a(context, input) == 0) {
                return new g.a.C1904a<>(Boolean.TRUE);
            }
            return null;
        }

        @Override // g.a
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Boolean parseResult(int i10, @Nullable Intent intent) {
            if (intent != null && i10 == -1) {
                int[] intArrayExtra = intent.getIntArrayExtra(k.f275346d);
                boolean z10 = false;
                if (intArrayExtra != null) {
                    for (int i11 : intArrayExtra) {
                        if (i11 == 0) {
                            z10 = true;
                            break;
                        }
                    }
                }
                return Boolean.valueOf(z10);
            }
            return Boolean.FALSE;
        }

        @Override // g.a
        @NotNull
        public Intent createIntent(@NotNull Context context, @NotNull String input) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(input, "input");
            return k.f275343a.a(new String[]{input});
        }
    }

    public static final class m extends g.a<Intent, ActivityResult> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final a f275347a = new a(null);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final String f275348b = "androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE";

        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private a() {
            }
        }

        @Override // g.a
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Intent createIntent(@NotNull Context context, @NotNull Intent input) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(input, "input");
            return input;
        }

        @Override // g.a
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public ActivityResult parseResult(int i10, @Nullable Intent intent) {
            return new ActivityResult(i10, intent);
        }
    }

    public static final class n extends g.a<IntentSenderRequest, ActivityResult> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final a f275349a = new a(null);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final String f275350b = "androidx.activity.result.contract.action.INTENT_SENDER_REQUEST";

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public static final String f275351c = "androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST";

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public static final String f275352d = "androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION";

        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private a() {
            }
        }

        @Override // g.a
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Intent createIntent(@NotNull Context context, @NotNull IntentSenderRequest input) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(input, "input");
            Intent intentPutExtra = new Intent(f275350b).putExtra(f275351c, input);
            Intrinsics.checkNotNullExpressionValue(intentPutExtra, "Intent(ACTION_INTENT_SEN…NT_SENDER_REQUEST, input)");
            return intentPutExtra;
        }

        @Override // g.a
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public ActivityResult parseResult(int i10, @Nullable Intent intent) {
            return new ActivityResult(i10, intent);
        }
    }

    public static class o extends g.a<Uri, Boolean> {
        @Override // g.a
        @androidx.annotation.i
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Intent createIntent(@NotNull Context context, @NotNull Uri input) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(input, "input");
            Intent intentPutExtra = new Intent("android.media.action.IMAGE_CAPTURE").putExtra("output", input);
            Intrinsics.checkNotNullExpressionValue(intentPutExtra, "Intent(MediaStore.ACTION…tore.EXTRA_OUTPUT, input)");
            return intentPutExtra;
        }

        @Override // g.a
        @Nullable
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final g.a.C1904a<Boolean> getSynchronousResult(@NotNull Context context, @NotNull Uri input) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(input, "input");
            return null;
        }

        @Override // g.a
        @NotNull
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Boolean parseResult(int i10, @Nullable Intent intent) {
            return Boolean.valueOf(i10 == -1);
        }
    }

    @SourceDebugExtension({"SMAP\nActivityResultContracts.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActivityResultContracts.kt\nandroidx/activity/result/contract/ActivityResultContracts$TakePicturePreview\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,962:1\n1#2:963\n*E\n"})
    public static class p extends g.a<Void, Bitmap> {
        @Override // g.a
        @androidx.annotation.i
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Intent createIntent(@NotNull Context context, @Nullable Void r10) {
            Intrinsics.checkNotNullParameter(context, "context");
            return new Intent("android.media.action.IMAGE_CAPTURE");
        }

        @Override // g.a
        @Nullable
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final g.a.C1904a<Bitmap> getSynchronousResult(@NotNull Context context, @Nullable Void r10) {
            Intrinsics.checkNotNullParameter(context, "context");
            return null;
        }

        @Override // g.a
        @Nullable
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Bitmap parseResult(int i10, @Nullable Intent intent) {
            if (i10 != -1) {
                intent = null;
            }
            if (intent != null) {
                return (Bitmap) intent.getParcelableExtra("data");
            }
            return null;
        }
    }

    @kotlin.l(message = "The thumbnail bitmap is rarely returned and is not a good signal to determine\n      whether the video was actually successfully captured. Use {@link CaptureVideo} instead.")
    @SourceDebugExtension({"SMAP\nActivityResultContracts.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActivityResultContracts.kt\nandroidx/activity/result/contract/ActivityResultContracts$TakeVideo\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,962:1\n1#2:963\n*E\n"})
    public static class q extends g.a<Uri, Bitmap> {
        @Override // g.a
        @androidx.annotation.i
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Intent createIntent(@NotNull Context context, @NotNull Uri input) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(input, "input");
            Intent intentPutExtra = new Intent("android.media.action.VIDEO_CAPTURE").putExtra("output", input);
            Intrinsics.checkNotNullExpressionValue(intentPutExtra, "Intent(MediaStore.ACTION…tore.EXTRA_OUTPUT, input)");
            return intentPutExtra;
        }

        @Override // g.a
        @Nullable
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final g.a.C1904a<Bitmap> getSynchronousResult(@NotNull Context context, @NotNull Uri input) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(input, "input");
            return null;
        }

        @Override // g.a
        @Nullable
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Bitmap parseResult(int i10, @Nullable Intent intent) {
            if (i10 != -1) {
                intent = null;
            }
            if (intent != null) {
                return (Bitmap) intent.getParcelableExtra("data");
            }
            return null;
        }
    }

    private b() {
    }
}
