package io.objectbox.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Annotation for entities
 * ObjectBox only persist objects of classes which are marked with this annotation
 */
@Retention(RetentionPolicy.CLASS)
@Target(ElementType.TYPE)
public @interface Entity {

// Maybe better than "createInDb":
// Class partialFor" to create a partial class referencing the class to the full entity
//    /**
//     * Advanced flag to disable table creation in the database (when set to false). This can be used to create partial
//     * entities, which may use only a sub set of properties. Be aware however that ObjectBox does not sync multiple
//     * entities, e.g. in caches.
//     */
//    boolean createInDb() default true;
//
//    /**
//     * Specifies schema name for the entity: ObjectBox can generate independent sets of classes for each schema.
//     * Entities which belong to different schemas should <strong>not</strong> have relations.
//     */
//    String schema() default "default";

    /**
     * Use a no-arg constructor instead of an all properties constructor (generated).
     */
    boolean useNoArgConstructor() default false;

//
//    /**
//     * Define a protobuf class of this entity to create an additional, special DAO for.
//     */
//    Class protobuf() default void.class;

}
