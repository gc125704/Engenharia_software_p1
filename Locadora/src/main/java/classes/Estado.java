package classes;

/***********************************************************************
 * Module:  Estado.java
 * Author:  gabriel
 * Purpose: Defines the Interface Estado
 ***********************************************************************/

import java.util.*;

/** @pdOid 3a792347-8393-4b69-a8ac-00ee427529c1 */
public interface Estado {
   /** @pdOid 9832e5ca-f08e-47fd-b5e6-f9e183ec3281 */
   void emprestar();
   /** @pdOid 8f2455f0-15b3-414a-abe7-e789f4772553 */
   void reservar();
   /** @pdOid 3b9cb7a5-4c31-40e6-b374-e1ceaf74b9db */
   void devolver();

}