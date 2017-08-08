package com.oop.hasOverIs;

import java.util.ArrayList;

/**
 * Created by ravibol on 8/7/17.
 */
public class Stack extends ArrayList
{   private int stack_pointer = 0;
    public void push( Object article )
    {   add( stack_pointer++, article );
    }
    public Object pop()
    {   return remove( --stack_pointer );
    }
    public void push_many( Object[] articles )
    {   for( int i = 0; i < articles.length; ++i )
        push( articles[i] );
    }
}
