/*
 * An XML document type.
 * Localname: Numbering
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.NumberingDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www.impl;
/**
 * A document containing one Numbering(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public class NumberingDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.NumberingDocument
{
    
    public NumberingDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NUMBERING$0 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Numbering");
    
    
    /**
     * Gets the "Numbering" element
     */
    public gov.nih.nlm.ncbi.www.NumberingDocument.Numbering getNumbering()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.NumberingDocument.Numbering target = null;
            target = (gov.nih.nlm.ncbi.www.NumberingDocument.Numbering)get_store().find_element_user(NUMBERING$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Numbering" element
     */
    public void setNumbering(gov.nih.nlm.ncbi.www.NumberingDocument.Numbering numbering)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.NumberingDocument.Numbering target = null;
            target = (gov.nih.nlm.ncbi.www.NumberingDocument.Numbering)get_store().find_element_user(NUMBERING$0, 0);
            if (target == null)
            {
                target = (gov.nih.nlm.ncbi.www.NumberingDocument.Numbering)get_store().add_element_user(NUMBERING$0);
            }
            target.set(numbering);
        }
    }
    
    /**
     * Appends and returns a new empty "Numbering" element
     */
    public gov.nih.nlm.ncbi.www.NumberingDocument.Numbering addNewNumbering()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.NumberingDocument.Numbering target = null;
            target = (gov.nih.nlm.ncbi.www.NumberingDocument.Numbering)get_store().add_element_user(NUMBERING$0);
            return target;
        }
    }
    /**
     * An XML Numbering(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public static class NumberingImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.NumberingDocument.Numbering
    {
        
        public NumberingImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName CONT$0 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "cont");
        private static final javax.xml.namespace.QName ENUM$2 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "enum");
        private static final javax.xml.namespace.QName REF$4 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "ref");
        private static final javax.xml.namespace.QName REAL$6 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "real");
        
        
        /**
         * Gets the "cont" element
         */
        public gov.nih.nlm.ncbi.www.NumberingDocument.Numbering.Cont getCont()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.NumberingDocument.Numbering.Cont target = null;
                target = (gov.nih.nlm.ncbi.www.NumberingDocument.Numbering.Cont)get_store().find_element_user(CONT$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "cont" element
         */
        public boolean isSetCont()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(CONT$0) != 0;
            }
        }
        
        /**
         * Sets the "cont" element
         */
        public void setCont(gov.nih.nlm.ncbi.www.NumberingDocument.Numbering.Cont cont)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.NumberingDocument.Numbering.Cont target = null;
                target = (gov.nih.nlm.ncbi.www.NumberingDocument.Numbering.Cont)get_store().find_element_user(CONT$0, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.NumberingDocument.Numbering.Cont)get_store().add_element_user(CONT$0);
                }
                target.set(cont);
            }
        }
        
        /**
         * Appends and returns a new empty "cont" element
         */
        public gov.nih.nlm.ncbi.www.NumberingDocument.Numbering.Cont addNewCont()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.NumberingDocument.Numbering.Cont target = null;
                target = (gov.nih.nlm.ncbi.www.NumberingDocument.Numbering.Cont)get_store().add_element_user(CONT$0);
                return target;
            }
        }
        
        /**
         * Unsets the "cont" element
         */
        public void unsetCont()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(CONT$0, 0);
            }
        }
        
        /**
         * Gets the "enum" element
         */
        public gov.nih.nlm.ncbi.www.NumberingDocument.Numbering.Enum1 getEnum()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.NumberingDocument.Numbering.Enum1 target = null;
                target = (gov.nih.nlm.ncbi.www.NumberingDocument.Numbering.Enum1)get_store().find_element_user(ENUM$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "enum" element
         */
        public boolean isSetEnum()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ENUM$2) != 0;
            }
        }
        
        /**
         * Sets the "enum" element
         */
        public void setEnum(gov.nih.nlm.ncbi.www.NumberingDocument.Numbering.Enum1 xenum)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.NumberingDocument.Numbering.Enum1 target = null;
                target = (gov.nih.nlm.ncbi.www.NumberingDocument.Numbering.Enum1)get_store().find_element_user(ENUM$2, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.NumberingDocument.Numbering.Enum1)get_store().add_element_user(ENUM$2);
                }
                target.set(xenum);
            }
        }
        
        /**
         * Appends and returns a new empty "enum" element
         */
        public gov.nih.nlm.ncbi.www.NumberingDocument.Numbering.Enum1 addNewEnum()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.NumberingDocument.Numbering.Enum1 target = null;
                target = (gov.nih.nlm.ncbi.www.NumberingDocument.Numbering.Enum1)get_store().add_element_user(ENUM$2);
                return target;
            }
        }
        
        /**
         * Unsets the "enum" element
         */
        public void unsetEnum()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ENUM$2, 0);
            }
        }
        
        /**
         * Gets the "ref" element
         */
        public gov.nih.nlm.ncbi.www.NumberingDocument.Numbering.Ref getRef()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.NumberingDocument.Numbering.Ref target = null;
                target = (gov.nih.nlm.ncbi.www.NumberingDocument.Numbering.Ref)get_store().find_element_user(REF$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "ref" element
         */
        public boolean isSetRef()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(REF$4) != 0;
            }
        }
        
        /**
         * Sets the "ref" element
         */
        public void setRef(gov.nih.nlm.ncbi.www.NumberingDocument.Numbering.Ref ref)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.NumberingDocument.Numbering.Ref target = null;
                target = (gov.nih.nlm.ncbi.www.NumberingDocument.Numbering.Ref)get_store().find_element_user(REF$4, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.NumberingDocument.Numbering.Ref)get_store().add_element_user(REF$4);
                }
                target.set(ref);
            }
        }
        
        /**
         * Appends and returns a new empty "ref" element
         */
        public gov.nih.nlm.ncbi.www.NumberingDocument.Numbering.Ref addNewRef()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.NumberingDocument.Numbering.Ref target = null;
                target = (gov.nih.nlm.ncbi.www.NumberingDocument.Numbering.Ref)get_store().add_element_user(REF$4);
                return target;
            }
        }
        
        /**
         * Unsets the "ref" element
         */
        public void unsetRef()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(REF$4, 0);
            }
        }
        
        /**
         * Gets the "real" element
         */
        public gov.nih.nlm.ncbi.www.NumberingDocument.Numbering.Real getReal()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.NumberingDocument.Numbering.Real target = null;
                target = (gov.nih.nlm.ncbi.www.NumberingDocument.Numbering.Real)get_store().find_element_user(REAL$6, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "real" element
         */
        public boolean isSetReal()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(REAL$6) != 0;
            }
        }
        
        /**
         * Sets the "real" element
         */
        public void setReal(gov.nih.nlm.ncbi.www.NumberingDocument.Numbering.Real real)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.NumberingDocument.Numbering.Real target = null;
                target = (gov.nih.nlm.ncbi.www.NumberingDocument.Numbering.Real)get_store().find_element_user(REAL$6, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.NumberingDocument.Numbering.Real)get_store().add_element_user(REAL$6);
                }
                target.set(real);
            }
        }
        
        /**
         * Appends and returns a new empty "real" element
         */
        public gov.nih.nlm.ncbi.www.NumberingDocument.Numbering.Real addNewReal()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.NumberingDocument.Numbering.Real target = null;
                target = (gov.nih.nlm.ncbi.www.NumberingDocument.Numbering.Real)get_store().add_element_user(REAL$6);
                return target;
            }
        }
        
        /**
         * Unsets the "real" element
         */
        public void unsetReal()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(REAL$6, 0);
            }
        }
        /**
         * An XML cont(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class ContImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.NumberingDocument.Numbering.Cont
        {
            
            public ContImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName NUMCONT$0 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Num-cont");
            
            
            /**
             * Gets the "Num-cont" element
             */
            public gov.nih.nlm.ncbi.www.NumContDocument.NumCont getNumCont()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.NumContDocument.NumCont target = null;
                    target = (gov.nih.nlm.ncbi.www.NumContDocument.NumCont)get_store().find_element_user(NUMCONT$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * Sets the "Num-cont" element
             */
            public void setNumCont(gov.nih.nlm.ncbi.www.NumContDocument.NumCont numCont)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.NumContDocument.NumCont target = null;
                    target = (gov.nih.nlm.ncbi.www.NumContDocument.NumCont)get_store().find_element_user(NUMCONT$0, 0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.NumContDocument.NumCont)get_store().add_element_user(NUMCONT$0);
                    }
                    target.set(numCont);
                }
            }
            
            /**
             * Appends and returns a new empty "Num-cont" element
             */
            public gov.nih.nlm.ncbi.www.NumContDocument.NumCont addNewNumCont()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.NumContDocument.NumCont target = null;
                    target = (gov.nih.nlm.ncbi.www.NumContDocument.NumCont)get_store().add_element_user(NUMCONT$0);
                    return target;
                }
            }
        }
        /**
         * An XML enum(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class EnumImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.NumberingDocument.Numbering.Enum1
        {
            
            public EnumImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName NUMENUM$0 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Num-enum");
            
            
            /**
             * Gets the "Num-enum" element
             */
            public gov.nih.nlm.ncbi.www.NumEnumDocument.NumEnum getNumEnum()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.NumEnumDocument.NumEnum target = null;
                    target = (gov.nih.nlm.ncbi.www.NumEnumDocument.NumEnum)get_store().find_element_user(NUMENUM$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * Sets the "Num-enum" element
             */
            public void setNumEnum(gov.nih.nlm.ncbi.www.NumEnumDocument.NumEnum numEnum)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.NumEnumDocument.NumEnum target = null;
                    target = (gov.nih.nlm.ncbi.www.NumEnumDocument.NumEnum)get_store().find_element_user(NUMENUM$0, 0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.NumEnumDocument.NumEnum)get_store().add_element_user(NUMENUM$0);
                    }
                    target.set(numEnum);
                }
            }
            
            /**
             * Appends and returns a new empty "Num-enum" element
             */
            public gov.nih.nlm.ncbi.www.NumEnumDocument.NumEnum addNewNumEnum()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.NumEnumDocument.NumEnum target = null;
                    target = (gov.nih.nlm.ncbi.www.NumEnumDocument.NumEnum)get_store().add_element_user(NUMENUM$0);
                    return target;
                }
            }
        }
        /**
         * An XML ref(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class RefImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.NumberingDocument.Numbering.Ref
        {
            
            public RefImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName NUMREF$0 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Num-ref");
            
            
            /**
             * Gets the "Num-ref" element
             */
            public gov.nih.nlm.ncbi.www.NumRefDocument.NumRef getNumRef()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.NumRefDocument.NumRef target = null;
                    target = (gov.nih.nlm.ncbi.www.NumRefDocument.NumRef)get_store().find_element_user(NUMREF$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * Sets the "Num-ref" element
             */
            public void setNumRef(gov.nih.nlm.ncbi.www.NumRefDocument.NumRef numRef)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.NumRefDocument.NumRef target = null;
                    target = (gov.nih.nlm.ncbi.www.NumRefDocument.NumRef)get_store().find_element_user(NUMREF$0, 0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.NumRefDocument.NumRef)get_store().add_element_user(NUMREF$0);
                    }
                    target.set(numRef);
                }
            }
            
            /**
             * Appends and returns a new empty "Num-ref" element
             */
            public gov.nih.nlm.ncbi.www.NumRefDocument.NumRef addNewNumRef()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.NumRefDocument.NumRef target = null;
                    target = (gov.nih.nlm.ncbi.www.NumRefDocument.NumRef)get_store().add_element_user(NUMREF$0);
                    return target;
                }
            }
        }
        /**
         * An XML real(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class RealImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.NumberingDocument.Numbering.Real
        {
            
            public RealImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName NUMREAL$0 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Num-real");
            
            
            /**
             * Gets the "Num-real" element
             */
            public gov.nih.nlm.ncbi.www.NumRealDocument.NumReal getNumReal()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.NumRealDocument.NumReal target = null;
                    target = (gov.nih.nlm.ncbi.www.NumRealDocument.NumReal)get_store().find_element_user(NUMREAL$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * Sets the "Num-real" element
             */
            public void setNumReal(gov.nih.nlm.ncbi.www.NumRealDocument.NumReal numReal)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.NumRealDocument.NumReal target = null;
                    target = (gov.nih.nlm.ncbi.www.NumRealDocument.NumReal)get_store().find_element_user(NUMREAL$0, 0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.NumRealDocument.NumReal)get_store().add_element_user(NUMREAL$0);
                    }
                    target.set(numReal);
                }
            }
            
            /**
             * Appends and returns a new empty "Num-real" element
             */
            public gov.nih.nlm.ncbi.www.NumRealDocument.NumReal addNewNumReal()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.NumRealDocument.NumReal target = null;
                    target = (gov.nih.nlm.ncbi.www.NumRealDocument.NumReal)get_store().add_element_user(NUMREAL$0);
                    return target;
                }
            }
        }
    }
}
