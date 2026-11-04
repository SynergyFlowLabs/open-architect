package app.rive.runtime.kotlin.core;

import androidx.annotation.l1;
import androidx.annotation.q0;
import app.rive.runtime.kotlin.core.errors.ArtboardException;
import app.rive.runtime.kotlin.core.errors.RiveException;
import app.rive.runtime.kotlin.core.errors.ViewModelException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;
import kotlin.ranges.r;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@q0
@SourceDebugExtension({"SMAP\nFile.kt\nKotlin\n*S Kotlin\n*F\n+ 1 File.kt\napp/rive/runtime/kotlin/core/File\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,188:1\n1557#2:189\n1628#2,3:190\n1557#2:193\n1628#2,3:194\n1#3:197\n*S KotlinDebug\n*F\n+ 1 File.kt\napp/rive/runtime/kotlin/core/File\n*L\n86#1:189\n86#1:190,3\n118#1:193\n118#1:194,3\n*E\n"})
public class File extends NativeObject {

    @NotNull
    private final ReentrantLock lock;

    @NotNull
    private final RendererType rendererType;

    public static final class Enum {

        @NotNull
        private final String name;

        @NotNull
        private final List<String> values;

        public Enum(@NotNull String name, @NotNull List<String> values) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(values, "values");
            this.name = name;
            this.values = values;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Enum copy$default(Enum r10, String str, List list, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = r10.name;
            }
            if ((i10 & 2) != 0) {
                list = r10.values;
            }
            return r10.copy(str, list);
        }

        @NotNull
        public final String component1() {
            return this.name;
        }

        @NotNull
        public final List<String> component2() {
            return this.values;
        }

        @NotNull
        public final Enum copy(@NotNull String name, @NotNull List<String> values) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(values, "values");
            return new Enum(name, values);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Enum)) {
                return false;
            }
            Enum r10 = (Enum) obj;
            return Intrinsics.areEqual(this.name, r10.name) && Intrinsics.areEqual(this.values, r10.values);
        }

        @NotNull
        public final String getName() {
            return this.name;
        }

        @NotNull
        public final List<String> getValues() {
            return this.values;
        }

        public int hashCode() {
            return (this.name.hashCode() * 31) + this.values.hashCode();
        }

        @NotNull
        public String toString() {
            return "Enum(name=" + this.name + ", values=" + this.values + ')';
        }
    }

    public /* synthetic */ File(byte[] bArr, RendererType rendererType, FileAssetLoader fileAssetLoader, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(bArr, (i10 & 2) != 0 ? Rive.INSTANCE.getDefaultRendererType() : rendererType, (i10 & 4) != 0 ? null : fileAssetLoader);
    }

    private native long cppArtboardByName(long j10, String str);

    private native int cppArtboardCount(long j10);

    private native String cppArtboardNameByIndex(long j10, int i10);

    private native long cppDefaultViewModelForArtboard(long j10, long j11);

    private native List<Enum> cppEnums(long j10);

    private native long cppViewModelByIndex(long j10, int i10);

    private native long cppViewModelByName(long j10, String str);

    private native int cppViewModelCount(long j10);

    /* JADX INFO: renamed from: import, reason: not valid java name */
    private native long m7import(byte[] bArr, int i10, int i11, long j10);

    @NotNull
    public Artboard artboard(@NotNull String name) throws RiveException {
        Intrinsics.checkNotNullParameter(name, "name");
        long jCppArtboardByName = cppArtboardByName(getCppPointer(), name);
        if (jCppArtboardByName != 0) {
            Artboard artboard = new Artboard(jCppArtboardByName, getLock());
            getDependencies().add(artboard);
            return artboard;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Artboard \"");
        sb2.append(name);
        sb2.append("\" not found. Available Artboards: ");
        List<String> artboardNames = getArtboardNames();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(artboardNames, 10));
        Iterator<T> it = artboardNames.iterator();
        while (it.hasNext()) {
            arrayList.add('\"' + ((String) it.next()) + '\"');
        }
        sb2.append(arrayList);
        throw new ArtboardException(sb2.toString());
    }

    @l1(otherwise = 2)
    protected native long cppArtboardByIndex(long j10, int i10);

    @Override // app.rive.runtime.kotlin.core.NativeObject
    public native void cppDelete(long j10);

    @NotNull
    public ViewModel defaultViewModelForArtboard(@NotNull Artboard artboard) throws ViewModelException {
        Intrinsics.checkNotNullParameter(artboard, "artboard");
        long jCppDefaultViewModelForArtboard = cppDefaultViewModelForArtboard(getCppPointer(), artboard.getCppPointer());
        if (jCppDefaultViewModelForArtboard != 0) {
            ViewModel viewModel = new ViewModel(jCppDefaultViewModelForArtboard);
            getDependencies().add(viewModel);
            return viewModel;
        }
        throw new ViewModelException("No default ViewModel found for artboard " + artboard.getName() + '.');
    }

    public int getArtboardCount() {
        return cppArtboardCount(getCppPointer());
    }

    @NotNull
    public List<String> getArtboardNames() {
        IntRange intRangeW1 = r.W1(0, getArtboardCount());
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(intRangeW1, 10));
        Iterator<Integer> it = intRangeW1.iterator();
        while (it.hasNext()) {
            arrayList.add(cppArtboardNameByIndex(getCppPointer(), ((IntIterator) it).nextInt()));
        }
        return arrayList;
    }

    @NotNull
    public List<Enum> getEnums() {
        return cppEnums(getCppPointer());
    }

    @NotNull
    public Artboard getFirstArtboard() throws RiveException {
        return artboard(0);
    }

    @NotNull
    public ReentrantLock getLock() {
        return this.lock;
    }

    @NotNull
    public RendererType getRendererType() {
        return this.rendererType;
    }

    @NotNull
    public ViewModel getViewModelByIndex(int i10) throws ViewModelException {
        long jCppViewModelByIndex = cppViewModelByIndex(getCppPointer(), i10);
        if (jCppViewModelByIndex != 0) {
            ViewModel viewModel = new ViewModel(jCppViewModelByIndex);
            getDependencies().add(viewModel);
            return viewModel;
        }
        throw new ViewModelException("No ViewModel found at index " + i10 + '.');
    }

    @NotNull
    public ViewModel getViewModelByName(@NotNull String viewModelName) throws ViewModelException {
        Intrinsics.checkNotNullParameter(viewModelName, "viewModelName");
        long jCppViewModelByName = cppViewModelByName(getCppPointer(), viewModelName);
        if (jCppViewModelByName != 0) {
            ViewModel viewModel = new ViewModel(jCppViewModelByName);
            getDependencies().add(viewModel);
            return viewModel;
        }
        throw new ViewModelException("No ViewModel found with name " + viewModelName + '.');
    }

    public int getViewModelCount() {
        return cppViewModelCount(getCppPointer());
    }

    @Override // app.rive.runtime.kotlin.core.NativeObject, app.rive.runtime.kotlin.core.RefCount
    public int release() {
        int iRelease;
        synchronized (getLock()) {
            try {
                iRelease = super.release();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return iRelease;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public File(@NotNull byte[] bytes, @NotNull RendererType rendererType, @Nullable FileAssetLoader fileAssetLoader) {
        super(0L);
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        Intrinsics.checkNotNullParameter(rendererType, "rendererType");
        this.rendererType = rendererType;
        if (fileAssetLoader != null) {
            fileAssetLoader.setRendererType(getRendererType());
        }
        setCppPointer(m7import(bytes, bytes.length, getRendererType().getValue(), fileAssetLoader != null ? fileAssetLoader.getCppPointer() : 0L));
        getRefs().incrementAndGet();
        this.lock = new ReentrantLock();
    }

    @NotNull
    public Artboard artboard(int i10) throws RiveException {
        long jCppArtboardByIndex = cppArtboardByIndex(getCppPointer(), i10);
        if (jCppArtboardByIndex != 0) {
            Artboard artboard = new Artboard(jCppArtboardByIndex, getLock());
            getDependencies().add(artboard);
            return artboard;
        }
        throw new ArtboardException("No Artboard found at index " + i10 + '.');
    }
}
