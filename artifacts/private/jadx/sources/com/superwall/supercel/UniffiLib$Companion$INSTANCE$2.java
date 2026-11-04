package com.superwall.supercel;

import com.sun.jna.Library;
import com.sun.jna.Native;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.l0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nCEL.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CEL.kt\ncom/superwall/supercel/UniffiLib$Companion$INSTANCE$2\n+ 2 CEL.kt\ncom/superwall/supercel/CELKt\n*L\n1#1,1829:1\n385#2:1830\n385#2:1831\n*S KotlinDebug\n*F\n+ 1 CEL.kt\ncom/superwall/supercel/UniffiLib$Companion$INSTANCE$2\n*L\n832#1:1830\n843#1:1831\n*E\n"})
final class UniffiLib$Companion$INSTANCE$2 extends l0 implements Function0<UniffiLib> {
    public static final UniffiLib$Companion$INSTANCE$2 INSTANCE = new UniffiLib$Companion$INSTANCE$2();

    UniffiLib$Companion$INSTANCE$2() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    @NotNull
    public final UniffiLib invoke() {
        Library libraryLoad = Native.load(CELKt.findLibraryName("cel"), (Class<Library>) IntegrityCheckingUniffiLib.class);
        Intrinsics.checkNotNullExpressionValue(libraryLoad, "load(...)");
        IntegrityCheckingUniffiLib integrityCheckingUniffiLib = (IntegrityCheckingUniffiLib) libraryLoad;
        CELKt.uniffiCheckContractApiVersion(integrityCheckingUniffiLib);
        CELKt.uniffiCheckApiChecksums(integrityCheckingUniffiLib);
        Library libraryLoad2 = Native.load(CELKt.findLibraryName("cel"), (Class<Library>) UniffiLib.class);
        Intrinsics.checkNotNullExpressionValue(libraryLoad2, "load(...)");
        UniffiLib uniffiLib = (UniffiLib) libraryLoad2;
        uniffiCallbackInterfaceHostContext.INSTANCE.register$supercel_release(uniffiLib);
        return uniffiLib;
    }
}
