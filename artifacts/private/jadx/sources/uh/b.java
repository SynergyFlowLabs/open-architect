package uh;

import io.grpc.w1;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: classes13.dex */
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.CLASS)
public @interface b {
    String fullMethodName();

    w1.d methodType();

    Class<?> requestType();

    Class<?> responseType();
}
