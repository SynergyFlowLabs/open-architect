package io.intercom.android.sdk.ui.component;

import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.provider.MediaStore;
import android.webkit.MimeTypeMap;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nMediaPickerButton.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MediaPickerButton.kt\nio/intercom/android/sdk/ui/component/IntercomMediaPicker\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,236:1\n3829#2:237\n4344#2,2:238\n3829#2:242\n4344#2,2:243\n3829#2:247\n4344#2,2:248\n37#3,2:240\n37#3,2:245\n37#3,2:250\n37#3,2:265\n1611#4,9:252\n1863#4:261\n1864#4:263\n1620#4:264\n1#5:262\n*S KotlinDebug\n*F\n+ 1 MediaPickerButton.kt\nio/intercom/android/sdk/ui/component/IntercomMediaPicker\n*L\n161#1:237\n161#1:238,2\n164#1:242\n164#1:243,2\n167#1:247\n167#1:248,2\n161#1:240,2\n164#1:245,2\n168#1:250,2\n172#1:265,2\n170#1:252,9\n170#1:261\n170#1:263\n170#1:264\n170#1:262\n*E\n"})
final class IntercomMediaPicker extends g.a<String, List<? extends Uri>> {
    private final int maxSelectionCount;

    @NotNull
    private final MediaType mediaType;

    @NotNull
    private final Set<String> trustedFileExtensions;

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MediaType.values().length];
            try {
                iArr[MediaType.All.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MediaType.DocumentOnly.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[MediaType.ImageAndVideo.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[MediaType.ImageOnly.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[MediaType.VideOnly.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public IntercomMediaPicker(@NotNull MediaType mediaType, @NotNull Set<String> trustedFileExtensions, int i10) {
        Intrinsics.checkNotNullParameter(mediaType, "mediaType");
        Intrinsics.checkNotNullParameter(trustedFileExtensions, "trustedFileExtensions");
        this.mediaType = mediaType;
        this.trustedFileExtensions = trustedFileExtensions;
        this.maxSelectionCount = i10;
    }

    private final String[] getAllMimeTypes() {
        Set<String> set = this.trustedFileExtensions;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = set.iterator();
        while (it.hasNext()) {
            String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension((String) it.next());
            if (mimeTypeFromExtension != null) {
                arrayList.add(mimeTypeFromExtension);
            }
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    private final List<Uri> getClipDataUris(Intent intent) {
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

    private final String[] getDocumentMimeTypes() {
        String[] allMimeTypes = getAllMimeTypes();
        ArrayList arrayList = new ArrayList();
        for (String str : allMimeTypes) {
            if (StringsKt.V2(str, "application", false, 2, null) || StringsKt.V2(str, "text", false, 2, null)) {
                arrayList.add(str);
            }
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    private final String[] getImageMimeTypes() {
        String[] allMimeTypes = getAllMimeTypes();
        ArrayList arrayList = new ArrayList();
        for (String str : allMimeTypes) {
            if (StringsKt.V2(str, "image", false, 2, null)) {
                arrayList.add(str);
            }
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    private final Intent getIntent(String str) {
        int i10 = WhenMappings.$EnumSwitchMapping$0[this.mediaType.ordinal()];
        if (i10 == 1) {
            Intent intentPutExtra = new Intent("android.intent.action.GET_CONTENT").addCategory("android.intent.category.OPENABLE").putExtra("android.intent.extra.MIME_TYPES", getAllMimeTypes()).setType(str).putExtra("android.intent.extra.ALLOW_MULTIPLE", this.maxSelectionCount > 1);
            Intrinsics.checkNotNull(intentPutExtra);
            return intentPutExtra;
        }
        if (i10 == 2) {
            return getNativePickerIntent(getDocumentMimeTypes());
        }
        int i11 = 5 ^ 3;
        if (i10 == 3) {
            return MediaPickerButtonKt.isPhotoPickerAvailable() ? getPhotoPickerIntent((String[]) ArraysKt.plus((Object[]) getImageMimeTypes(), (Object[]) getVideoMimeTypes())) : getNativePickerIntent((String[]) ArraysKt.plus((Object[]) getImageMimeTypes(), (Object[]) getVideoMimeTypes()));
        }
        if (i10 == 4) {
            return MediaPickerButtonKt.isPhotoPickerAvailable() ? getPhotoPickerIntent(getImageMimeTypes()) : getNativePickerIntent(getImageMimeTypes());
        }
        if (i10 == 5) {
            return MediaPickerButtonKt.isPhotoPickerAvailable() ? getPhotoPickerIntent(getVideoMimeTypes()) : getNativePickerIntent(getVideoMimeTypes());
        }
        throw new kotlin.k0();
    }

    private final Intent getNativePickerIntent(String[] strArr) {
        Intent intentPutExtra = new Intent("android.intent.action.GET_CONTENT").addCategory("android.intent.category.OPENABLE").setType((String) ArraysKt.first(strArr)).putExtra("android.intent.extra.MIME_TYPES", strArr).addFlags(1).putExtra("android.intent.extra.ALLOW_MULTIPLE", this.maxSelectionCount > 1);
        Intrinsics.checkNotNullExpressionValue(intentPutExtra, "putExtra(...)");
        return intentPutExtra;
    }

    private final Intent getPhotoPickerIntent(String[] strArr) {
        Intent intent = new Intent("android.provider.action.PICK_IMAGES");
        intent.putExtra("android.intent.extra.MIME_TYPES", strArr);
        int i10 = this.maxSelectionCount;
        if (i10 <= 1) {
            return intent;
        }
        if (i10 > MediaStore.getPickImagesMaxLimit()) {
            throw new IllegalArgumentException("Max items must be less or equals MediaStore.getPickImagesMaxLimit()");
        }
        intent.putExtra("android.provider.extra.PICK_IMAGES_MAX", this.maxSelectionCount);
        return intent;
    }

    private final String[] getVideoMimeTypes() {
        String[] allMimeTypes = getAllMimeTypes();
        ArrayList arrayList = new ArrayList();
        for (String str : allMimeTypes) {
            if (StringsKt.V2(str, "video", false, 2, null)) {
                arrayList.add(str);
            }
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    @Override // g.a
    @NotNull
    public Intent createIntent(@NotNull Context context, @NotNull String input) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(input, "input");
        return getIntent(input);
    }

    @Override // g.a
    @NotNull
    public List<? extends Uri> parseResult(int i10, @Nullable Intent intent) {
        List<Uri> clipDataUris;
        if (i10 != -1) {
            intent = null;
        }
        return (intent == null || (clipDataUris = getClipDataUris(intent)) == null) ? CollectionsKt.emptyList() : clipDataUris;
    }
}
