package app.rive.runtime.kotlin.core;

import androidx.annotation.m1;
import app.rive.runtime.kotlin.core.errors.ViewModelException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nViewModelInstance.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ViewModelInstance.kt\napp/rive/runtime/kotlin/core/ViewModelInstance\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,442:1\n186#1,23:450\n186#1,23:473\n186#1,23:496\n186#1,23:519\n186#1,23:542\n186#1,23:565\n774#2:443\n865#2,2:444\n1863#2,2:446\n1863#2,2:448\n381#3,7:588\n*S KotlinDebug\n*F\n+ 1 ViewModelInstance.kt\napp/rive/runtime/kotlin/core/ViewModelInstance\n*L\n78#1:450,23\n89#1:473,23\n100#1:496,23\n113#1:519,23\n126#1:542,23\n137#1:565,23\n63#1:443\n63#1:444,2\n63#1:446,2\n64#1:448,2\n237#1:588,7\n*E\n"})
public final class ViewModelInstance extends NativeObject {

    @NotNull
    private Map<String, ViewModelInstance> children;

    @NotNull
    private Map<String, ViewModelProperty<?>> properties;

    public static final class Transfer {

        @NotNull
        private final ViewModelInstance instance;
        private boolean valid;

        public Transfer(@NotNull ViewModelInstance instance) throws ViewModelException {
            Intrinsics.checkNotNullParameter(instance, "instance");
            this.instance = instance;
            this.valid = true;
            if (instance.getRefCount() <= 0) {
                throw new ViewModelException("Cannot transfer a disposed ViewModelInstance.");
            }
            instance.cppRefInstance(instance.getCppPointer());
            instance.acquire();
        }

        public final void dispose() throws ViewModelException {
            if (this.valid) {
                this.valid = false;
                this.instance.release();
            } else {
                throw new ViewModelException("Transfer of ViewModelInstance " + this.instance + " already ended. Cannot dispose.");
            }
        }

        @NotNull
        public final ViewModelInstance end$kotlin_release() throws ViewModelException {
            if (this.valid) {
                this.valid = false;
                return this.instance;
            }
            throw new ViewModelException("Transfer of ViewModelInstance " + this.instance + " already ended. Cannot end transfer again.");
        }
    }

    public ViewModelInstance(long j10) {
        super(j10);
        this.properties = new LinkedHashMap();
        this.children = new LinkedHashMap();
        cppRefInstance(getCppPointer());
    }

    private final native void cppDerefInstance(long j10);

    private final native String cppName(long j10);

    /* JADX INFO: Access modifiers changed from: private */
    public final native long cppPropertyBoolean(long j10, String str);

    /* JADX INFO: Access modifiers changed from: private */
    public final native long cppPropertyColor(long j10, String str);

    /* JADX INFO: Access modifiers changed from: private */
    public final native long cppPropertyEnum(long j10, String str);

    private final native long cppPropertyInstance(long j10, String str);

    /* JADX INFO: Access modifiers changed from: private */
    public final native long cppPropertyNumber(long j10, String str);

    /* JADX INFO: Access modifiers changed from: private */
    public final native long cppPropertyString(long j10, String str);

    /* JADX INFO: Access modifiers changed from: private */
    public final native long cppPropertyTrigger(long j10, String str);

    /* JADX INFO: Access modifiers changed from: private */
    public final native void cppRefInstance(long j10);

    private final native boolean cppSetInstanceProperty(long j10, String str, long j11);

    private final /* synthetic */ <T extends ViewModelProperty<?>> T getProperty(String str, Function2<? super Long, ? super String, Long> function2, Function1<? super Long, ? extends T> function1) throws ViewModelException {
        List listSplit$default = StringsKt.split$default(str, new String[]{"/"}, false, 0, 6, null);
        List<String> listSubList = listSplit$default.subList(0, listSplit$default.size() - 1);
        String str2 = (String) CollectionsKt.last(listSplit$default);
        ViewModelInstance viewModelInstanceTraverse = traverse(listSubList);
        T t10 = (T) viewModelInstanceTraverse.properties.get(str2);
        if (t10 != null) {
            Intrinsics.reifiedOperationMarker(3, androidx.exifinterface.media.a.f51379e5);
            return t10;
        }
        long jLongValue = function2.invoke(Long.valueOf(viewModelInstanceTraverse.getCppPointer()), str2).longValue();
        if (jLongValue != 0) {
            T tInvoke = function1.invoke(Long.valueOf(jLongValue));
            viewModelInstanceTraverse.properties.put(str2, tInvoke);
            getDependencies().add(tInvoke);
            return tInvoke;
        }
        throw new ViewModelException("Property not found: " + str);
    }

    private final ViewModelInstance traverse(List<String> list) throws ViewModelException {
        if (list.isEmpty()) {
            return this;
        }
        String str = (String) CollectionsKt.first((List) list);
        Map<String, ViewModelInstance> map = this.children;
        ViewModelInstance viewModelInstanceTraverse$createChildInstance = map.get(str);
        if (viewModelInstanceTraverse$createChildInstance == null) {
            viewModelInstanceTraverse$createChildInstance = traverse$createChildInstance(this, str);
            map.put(str, viewModelInstanceTraverse$createChildInstance);
        }
        return viewModelInstanceTraverse$createChildInstance.traverse(list.subList(1, list.size()));
    }

    private static final ViewModelInstance traverse$createChildInstance(ViewModelInstance viewModelInstance, String str) throws ViewModelException {
        long jCppPropertyInstance = viewModelInstance.cppPropertyInstance(viewModelInstance.getCppPointer(), str);
        if (jCppPropertyInstance != 0) {
            ViewModelInstance viewModelInstance2 = new ViewModelInstance(jCppPropertyInstance);
            viewModelInstance.children.put(str, viewModelInstance2);
            viewModelInstance.getDependencies().add(viewModelInstance2);
            return viewModelInstance2;
        }
        throw new ViewModelException("Property not found: " + str);
    }

    @Override // app.rive.runtime.kotlin.core.NativeObject
    public void cppDelete(long j10) {
        cppDerefInstance(j10);
    }

    @NotNull
    public final ViewModelBooleanProperty getBooleanProperty(@NotNull String path) throws ViewModelException {
        Intrinsics.checkNotNullParameter(path, "path");
        List listSplit$default = StringsKt.split$default(path, new String[]{"/"}, false, 0, 6, null);
        List<String> listSubList = listSplit$default.subList(0, listSplit$default.size() - 1);
        String str = (String) CollectionsKt.last(listSplit$default);
        ViewModelInstance viewModelInstanceTraverse = traverse(listSubList);
        ViewModelProperty<?> viewModelProperty = viewModelInstanceTraverse.properties.get(str);
        if (viewModelProperty == null) {
            long jCppPropertyBoolean = cppPropertyBoolean(viewModelInstanceTraverse.getCppPointer(), str);
            if (jCppPropertyBoolean == 0) {
                throw new ViewModelException("Property not found: " + path);
            }
            ViewModelBooleanProperty viewModelBooleanProperty = new ViewModelBooleanProperty(jCppPropertyBoolean);
            viewModelInstanceTraverse.properties.put(str, viewModelBooleanProperty);
            getDependencies().add(viewModelBooleanProperty);
            viewModelProperty = viewModelBooleanProperty;
        } else if (!(viewModelProperty instanceof ViewModelBooleanProperty)) {
            throw new ViewModelException("Property '" + str + "' exists but is not of the expected type.");
        }
        return (ViewModelBooleanProperty) viewModelProperty;
    }

    @NotNull
    public final ViewModelColorProperty getColorProperty(@NotNull String path) throws ViewModelException {
        Intrinsics.checkNotNullParameter(path, "path");
        List listSplit$default = StringsKt.split$default(path, new String[]{"/"}, false, 0, 6, null);
        List<String> listSubList = listSplit$default.subList(0, listSplit$default.size() - 1);
        String str = (String) CollectionsKt.last(listSplit$default);
        ViewModelInstance viewModelInstanceTraverse = traverse(listSubList);
        ViewModelProperty<?> viewModelProperty = viewModelInstanceTraverse.properties.get(str);
        if (viewModelProperty == null) {
            long jCppPropertyColor = cppPropertyColor(viewModelInstanceTraverse.getCppPointer(), str);
            if (jCppPropertyColor == 0) {
                throw new ViewModelException("Property not found: " + path);
            }
            ViewModelColorProperty viewModelColorProperty = new ViewModelColorProperty(jCppPropertyColor);
            viewModelInstanceTraverse.properties.put(str, viewModelColorProperty);
            getDependencies().add(viewModelColorProperty);
            viewModelProperty = viewModelColorProperty;
        } else if (!(viewModelProperty instanceof ViewModelColorProperty)) {
            throw new ViewModelException("Property '" + str + "' exists but is not of the expected type.");
        }
        return (ViewModelColorProperty) viewModelProperty;
    }

    @NotNull
    public final ViewModelEnumProperty getEnumProperty(@NotNull String path) throws ViewModelException {
        Intrinsics.checkNotNullParameter(path, "path");
        int i10 = 1 >> 0;
        List listSplit$default = StringsKt.split$default(path, new String[]{"/"}, false, 0, 6, null);
        List<String> listSubList = listSplit$default.subList(0, listSplit$default.size() - 1);
        String str = (String) CollectionsKt.last(listSplit$default);
        ViewModelInstance viewModelInstanceTraverse = traverse(listSubList);
        ViewModelProperty<?> viewModelProperty = viewModelInstanceTraverse.properties.get(str);
        if (viewModelProperty == null) {
            long jCppPropertyEnum = cppPropertyEnum(viewModelInstanceTraverse.getCppPointer(), str);
            if (jCppPropertyEnum == 0) {
                throw new ViewModelException("Property not found: " + path);
            }
            ViewModelEnumProperty viewModelEnumProperty = new ViewModelEnumProperty(jCppPropertyEnum);
            viewModelInstanceTraverse.properties.put(str, viewModelEnumProperty);
            getDependencies().add(viewModelEnumProperty);
            viewModelProperty = viewModelEnumProperty;
        } else if (!(viewModelProperty instanceof ViewModelEnumProperty)) {
            throw new ViewModelException("Property '" + str + "' exists but is not of the expected type.");
        }
        return (ViewModelEnumProperty) viewModelProperty;
    }

    @NotNull
    public final ViewModelInstance getInstanceProperty(@NotNull String path) throws ViewModelException {
        Intrinsics.checkNotNullParameter(path, "path");
        return traverse(StringsKt.split$default(path, new String[]{"/"}, false, 0, 6, null));
    }

    @NotNull
    public final String getName() {
        return cppName(getCppPointer());
    }

    @NotNull
    public final ViewModelNumberProperty getNumberProperty(@NotNull String path) throws ViewModelException {
        Intrinsics.checkNotNullParameter(path, "path");
        List listSplit$default = StringsKt.split$default(path, new String[]{"/"}, false, 0, 6, null);
        List<String> listSubList = listSplit$default.subList(0, listSplit$default.size() - 1);
        String str = (String) CollectionsKt.last(listSplit$default);
        ViewModelInstance viewModelInstanceTraverse = traverse(listSubList);
        ViewModelProperty<?> viewModelProperty = viewModelInstanceTraverse.properties.get(str);
        if (viewModelProperty == null) {
            long jCppPropertyNumber = cppPropertyNumber(viewModelInstanceTraverse.getCppPointer(), str);
            if (jCppPropertyNumber == 0) {
                throw new ViewModelException("Property not found: " + path);
            }
            ViewModelNumberProperty viewModelNumberProperty = new ViewModelNumberProperty(jCppPropertyNumber);
            viewModelInstanceTraverse.properties.put(str, viewModelNumberProperty);
            getDependencies().add(viewModelNumberProperty);
            viewModelProperty = viewModelNumberProperty;
        } else if (!(viewModelProperty instanceof ViewModelNumberProperty)) {
            throw new ViewModelException("Property '" + str + "' exists but is not of the expected type.");
        }
        return (ViewModelNumberProperty) viewModelProperty;
    }

    @NotNull
    public final ViewModelStringProperty getStringProperty(@NotNull String path) throws ViewModelException {
        Intrinsics.checkNotNullParameter(path, "path");
        List listSplit$default = StringsKt.split$default(path, new String[]{"/"}, false, 0, 6, null);
        List<String> listSubList = listSplit$default.subList(0, listSplit$default.size() - 1);
        String str = (String) CollectionsKt.last(listSplit$default);
        ViewModelInstance viewModelInstanceTraverse = traverse(listSubList);
        ViewModelProperty<?> viewModelProperty = viewModelInstanceTraverse.properties.get(str);
        if (viewModelProperty == null) {
            long jCppPropertyString = cppPropertyString(viewModelInstanceTraverse.getCppPointer(), str);
            if (jCppPropertyString == 0) {
                throw new ViewModelException("Property not found: " + path);
            }
            ViewModelStringProperty viewModelStringProperty = new ViewModelStringProperty(jCppPropertyString);
            viewModelInstanceTraverse.properties.put(str, viewModelStringProperty);
            getDependencies().add(viewModelStringProperty);
            viewModelProperty = viewModelStringProperty;
        } else if (!(viewModelProperty instanceof ViewModelStringProperty)) {
            throw new ViewModelException("Property '" + str + "' exists but is not of the expected type.");
        }
        return (ViewModelStringProperty) viewModelProperty;
    }

    @NotNull
    public final ViewModelTriggerProperty getTriggerProperty(@NotNull String path) throws ViewModelException {
        Intrinsics.checkNotNullParameter(path, "path");
        List listSplit$default = StringsKt.split$default(path, new String[]{"/"}, false, 0, 6, null);
        List<String> listSubList = listSplit$default.subList(0, listSplit$default.size() - 1);
        String str = (String) CollectionsKt.last(listSplit$default);
        ViewModelInstance viewModelInstanceTraverse = traverse(listSubList);
        ViewModelProperty<?> viewModelProperty = viewModelInstanceTraverse.properties.get(str);
        if (viewModelProperty == null) {
            long jCppPropertyTrigger = cppPropertyTrigger(viewModelInstanceTraverse.getCppPointer(), str);
            if (jCppPropertyTrigger == 0) {
                throw new ViewModelException("Property not found: " + path);
            }
            ViewModelTriggerProperty viewModelTriggerProperty = new ViewModelTriggerProperty(jCppPropertyTrigger);
            viewModelInstanceTraverse.properties.put(str, viewModelTriggerProperty);
            getDependencies().add(viewModelTriggerProperty);
            viewModelProperty = viewModelTriggerProperty;
        } else if (!(viewModelProperty instanceof ViewModelTriggerProperty)) {
            throw new ViewModelException("Property '" + str + "' exists but is not of the expected type.");
        }
        return (ViewModelTriggerProperty) viewModelProperty;
    }

    @m1
    public final void pollChanges$kotlin_release() {
        Collection<ViewModelProperty<?>> collectionValues = this.properties.values();
        ArrayList arrayList = new ArrayList();
        for (Object obj : collectionValues) {
            if (((ViewModelProperty) obj).isSubscribed$kotlin_release()) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((ViewModelProperty) it.next()).pollChanges$kotlin_release();
        }
        Iterator<T> it2 = this.children.values().iterator();
        while (it2.hasNext()) {
            ((ViewModelInstance) it2.next()).pollChanges$kotlin_release();
        }
    }

    public final void setInstanceProperty(@NotNull String path, @NotNull ViewModelInstance instance) throws ViewModelException {
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(instance, "instance");
        int i10 = 7 ^ 0;
        List listSplit$default = StringsKt.split$default(path, new String[]{"/"}, false, 0, 6, null);
        List<String> listSubList = listSplit$default.subList(0, listSplit$default.size() - 1);
        String str = (String) CollectionsKt.last(listSplit$default);
        ViewModelInstance viewModelInstanceTraverse = traverse(listSubList);
        if (cppSetInstanceProperty(viewModelInstanceTraverse.getCppPointer(), str, instance.getCppPointer())) {
            viewModelInstanceTraverse.children.put(str, instance);
            return;
        }
        throw new ViewModelException("Property not found: " + path + "; or instance is incompatible.");
    }

    @NotNull
    public final Transfer transfer() {
        return new Transfer(this);
    }
}
