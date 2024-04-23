/**
 * generated by Xtext 2.34.0
 */
package org.palladiosimulator.xtext.motiarc.mcBasics.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.palladiosimulator.xtext.motiarc.mcBasics.Argument;
import org.palladiosimulator.xtext.motiarc.mcBasics.Arguments;
import org.palladiosimulator.xtext.motiarc.mcBasics.BinaryExpression;
import org.palladiosimulator.xtext.motiarc.mcBasics.Expression;
import org.palladiosimulator.xtext.motiarc.mcBasics.ImportStatements;
import org.palladiosimulator.xtext.motiarc.mcBasics.LiteralExpression;
import org.palladiosimulator.xtext.motiarc.mcBasics.MCArrayType;
import org.palladiosimulator.xtext.motiarc.mcBasics.MCCollectionType;
import org.palladiosimulator.xtext.motiarc.mcBasics.MCObjectType;
import org.palladiosimulator.xtext.motiarc.mcBasics.MCPrimitiveType;
import org.palladiosimulator.xtext.motiarc.mcBasics.MCVoidType;
import org.palladiosimulator.xtext.motiarc.mcBasics.McBasicsFactory;
import org.palladiosimulator.xtext.motiarc.mcBasics.McBasicsPackage;
import org.palladiosimulator.xtext.motiarc.mcBasics.NameExpression;
import org.palladiosimulator.xtext.motiarc.mcBasics.NumberLiteral;
import org.palladiosimulator.xtext.motiarc.mcBasics.Operator;
import org.palladiosimulator.xtext.motiarc.mcBasics.StringLiteral;
import org.palladiosimulator.xtext.motiarc.mcBasics.Type;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class McBasicsFactoryImpl extends EFactoryImpl implements McBasicsFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static McBasicsFactory init()
  {
    try
    {
      McBasicsFactory theMcBasicsFactory = (McBasicsFactory)EPackage.Registry.INSTANCE.getEFactory(McBasicsPackage.eNS_URI);
      if (theMcBasicsFactory != null)
      {
        return theMcBasicsFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new McBasicsFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public McBasicsFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case McBasicsPackage.IMPORT_STATEMENTS: return createImportStatements();
      case McBasicsPackage.PACKAGE: return createPackage();
      case McBasicsPackage.TYPE: return createType();
      case McBasicsPackage.MC_PRIMITIVE_TYPE: return createMCPrimitiveType();
      case McBasicsPackage.MC_OBJECT_TYPE: return createMCObjectType();
      case McBasicsPackage.MC_VOID_TYPE: return createMCVoidType();
      case McBasicsPackage.MC_COLLECTION_TYPE: return createMCCollectionType();
      case McBasicsPackage.MC_ARRAY_TYPE: return createMCArrayType();
      case McBasicsPackage.EXPRESSION: return createExpression();
      case McBasicsPackage.LITERAL_EXPRESSION: return createLiteralExpression();
      case McBasicsPackage.NUMBER_LITERAL: return createNumberLiteral();
      case McBasicsPackage.STRING_LITERAL: return createStringLiteral();
      case McBasicsPackage.NAME_EXPRESSION: return createNameExpression();
      case McBasicsPackage.BINARY_EXPRESSION: return createBinaryExpression();
      case McBasicsPackage.ARGUMENTS: return createArguments();
      case McBasicsPackage.ARGUMENT: return createArgument();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object createFromString(EDataType eDataType, String initialValue)
  {
    switch (eDataType.getClassifierID())
    {
      case McBasicsPackage.OPERATOR:
        return createOperatorFromString(eDataType, initialValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String convertToString(EDataType eDataType, Object instanceValue)
  {
    switch (eDataType.getClassifierID())
    {
      case McBasicsPackage.OPERATOR:
        return convertOperatorToString(eDataType, instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ImportStatements createImportStatements()
  {
    ImportStatementsImpl importStatements = new ImportStatementsImpl();
    return importStatements;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public org.palladiosimulator.xtext.motiarc.mcBasics.Package createPackage()
  {
    PackageImpl package_ = new PackageImpl();
    return package_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Type createType()
  {
    TypeImpl type = new TypeImpl();
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public MCPrimitiveType createMCPrimitiveType()
  {
    MCPrimitiveTypeImpl mcPrimitiveType = new MCPrimitiveTypeImpl();
    return mcPrimitiveType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public MCObjectType createMCObjectType()
  {
    MCObjectTypeImpl mcObjectType = new MCObjectTypeImpl();
    return mcObjectType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public MCVoidType createMCVoidType()
  {
    MCVoidTypeImpl mcVoidType = new MCVoidTypeImpl();
    return mcVoidType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public MCCollectionType createMCCollectionType()
  {
    MCCollectionTypeImpl mcCollectionType = new MCCollectionTypeImpl();
    return mcCollectionType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public MCArrayType createMCArrayType()
  {
    MCArrayTypeImpl mcArrayType = new MCArrayTypeImpl();
    return mcArrayType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Expression createExpression()
  {
    ExpressionImpl expression = new ExpressionImpl();
    return expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public LiteralExpression createLiteralExpression()
  {
    LiteralExpressionImpl literalExpression = new LiteralExpressionImpl();
    return literalExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NumberLiteral createNumberLiteral()
  {
    NumberLiteralImpl numberLiteral = new NumberLiteralImpl();
    return numberLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public StringLiteral createStringLiteral()
  {
    StringLiteralImpl stringLiteral = new StringLiteralImpl();
    return stringLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NameExpression createNameExpression()
  {
    NameExpressionImpl nameExpression = new NameExpressionImpl();
    return nameExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public BinaryExpression createBinaryExpression()
  {
    BinaryExpressionImpl binaryExpression = new BinaryExpressionImpl();
    return binaryExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Arguments createArguments()
  {
    ArgumentsImpl arguments = new ArgumentsImpl();
    return arguments;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Argument createArgument()
  {
    ArgumentImpl argument = new ArgumentImpl();
    return argument;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Operator createOperatorFromString(EDataType eDataType, String initialValue)
  {
    Operator result = Operator.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertOperatorToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public McBasicsPackage getMcBasicsPackage()
  {
    return (McBasicsPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static McBasicsPackage getPackage()
  {
    return McBasicsPackage.eINSTANCE;
  }

} //McBasicsFactoryImpl
